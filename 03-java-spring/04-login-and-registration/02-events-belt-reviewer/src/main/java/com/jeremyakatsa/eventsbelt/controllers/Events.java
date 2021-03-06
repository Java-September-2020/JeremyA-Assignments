package com.jeremyakatsa.eventsbelt.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jeremyakatsa.eventsbelt.models.Event;
import com.jeremyakatsa.eventsbelt.models.Message;
import com.jeremyakatsa.eventsbelt.models.State;
import com.jeremyakatsa.eventsbelt.models.User;
import com.jeremyakatsa.eventsbelt.services.EventService;
import com.jeremyakatsa.eventsbelt.services.UserService;

@Controller
@RequestMapping("/events")
public class Events {
	private final UserService userService;
    private final EventService eventService;
    
    public Events(UserService userService, EventService eventService) {
    	this.userService = userService;
    	this.eventService = eventService;
    }
    
	@GetMapping("")
    public String Index(@ModelAttribute("event") Event event, Model model, HttpSession session) {
		Long userId = (Long)session.getAttribute("userId");
		if(session.getAttribute("userId") == null) {
			return "redirect:/";
		}
        // get user from session, save them in the model and return the home page
		User user = userService.findById(userId);
		model.addAttribute("userStates", this.eventService.allEventsWithState(user.getState()));
		model.addAttribute("otherStates", this.eventService.allEventsNotState(user.getState()));
		model.addAttribute("user", user);
		model.addAttribute("states", State.States);
		return "/events/index.jsp";
    }
	
	@PostMapping("")
	public String addEvent(@Valid @ModelAttribute("event") Event newEvent, BindingResult result, Model model, HttpSession session) {
		if(result.hasErrors()) {
			Long userId = (Long)session.getAttribute("userId");
			User user = userService.findById(userId);
			model.addAttribute("userStates", this.eventService.allEventsWithState(user.getState()));
			model.addAttribute("otherStates", this.eventService.allEventsNotState(user.getState()));
			model.addAttribute("user", user);
			model.addAttribute("states", State.States);
			return "/events/index.jsp";
		} else {
			this.eventService.create(newEvent);
			return "redirect:/events";
		}
	}
	
	@GetMapping("/{id}/join")
	private String joinEvent(@PathVariable("id") Long id, HttpSession session){
		Long userId = (Long)session.getAttribute("userId");
		Long eventId = id;
		User joined = this.userService.findById(userId);
		Event joinedEvent = this.eventService.findById(eventId);
		this.eventService.joinEvent(joined, joinedEvent);
		return "redirect:/events";
	}
	
	@GetMapping("/{id}/cancel")
	private String cancelEvent(@PathVariable("id") Long id, HttpSession session) {
		Long userId = (Long)session.getAttribute("userId");
		Long eventId = id;
		User canceled = this.userService.findById(userId);
		Event canceledEvent = this.eventService.findById(eventId);
		this.eventService.cancelEvent(canceled, canceledEvent);
		return "redirect:/events";
	}
	
	@GetMapping("/{id}")
	private String showEvent(@PathVariable("id") Long id, Model model, @ModelAttribute("message") Message message, HttpSession session) {
		model.addAttribute("event", this.eventService.findById(id));
		model.addAttribute("userId", session.getAttribute("userId"));
		return "/events/show.jsp";
	}
	
	@PostMapping("/{id}/comment")
	public String Comment(@PathVariable("id") Long id, @RequestParam("comment") String comment, RedirectAttributes redirs, HttpSession session) {
		Long userId = (Long)session.getAttribute("userId");
		if(userId == null)
			return "redirect:/";
		if(comment.equals("")) {
			redirs.addFlashAttribute("error", "Comment must not be blank");
			return "redirect:/events/" + id ;
		}
		Event event = this.eventService.findById(id);
		User user = this.userService.findById(userId);
		this.eventService.comment(user, event, comment);
		return "redirect:/events/" + id;
	}
	
	@GetMapping("/{id}/edit")
	public String Edit(@PathVariable("id") Long id, HttpSession session, Model model) {
		Long userId = (Long)session.getAttribute("userId");
		Event event = this.eventService.findById(id);
		if(userId == null)
			return "redirect:/";
		if(event == null || !event.getEventCreator().getId().equals(userId))
			return "redirect:/events";
		
		model.addAttribute("event", event);
		model.addAttribute("states", State.States);
		model.addAttribute("userId", userId);
		return "/events/edit.jsp";
	}
	
	@PutMapping("{id}")
	public String updateEvent(@Valid @ModelAttribute("event") Event updateEvent, BindingResult result, @PathVariable("id") Long id, 
			HttpSession session, Model model) {
		if(result.hasErrors()) {
			Long userId = (Long)session.getAttribute("userId");
			model.addAttribute("event", updateEvent);
			model.addAttribute("states", State.States);
			model.addAttribute("userId", userId);
			return "/events/edit.jsp";
		} else {
			this.eventService.update(updateEvent);
			return "redirect:/events";
		}
	}
	
	@GetMapping("/delete/{id}")
	public String deleteEvent(@PathVariable("id") Long id) {
		this.eventService.delete(id);
		return "redirect:/events";
	}

	
	
}
