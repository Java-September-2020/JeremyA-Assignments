package com.jeremyakatsa.eventsbelt.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jeremyakatsa.eventsbelt.models.Event;
import com.jeremyakatsa.eventsbelt.models.User;
import com.jeremyakatsa.eventsbelt.services.EventService;
import com.jeremyakatsa.eventsbelt.services.UserService;

@Controller
@RequestMapping ("/events")
public class Events {
	private final UserService userService;
    private final EventService eventService;
    
    public Events(UserService userService, EventService eventService) {
    	this.userService = userService;
    	this.eventService = eventService;
    }
    
	
	@GetMapping("")
    public String Index(HttpSession session, Model model) {
		if(session.getAttribute("user_id") == null) {
			return "redirect:/";
		}
        // get user from session, save them in the model and return the home page
    	Long userId = (Long)session.getAttribute("userId");
		User user = userService.findById(userId);
		List<Event> allEvents = this.eventService.getAllEvents();
		model.addAttribute("allEvents", allEvents);
		model.addAttribute("user", user);
		return "/events/index.jsp";
    }
	
	@GetMapping("/new")
	public String addEvent(@ModelAttribute("event") Event event, BindingResult result) {
		if(result.hasErrors()) {
			return "/events/index.jsp";
		} else {
			this.eventService.create(event);
			return "redirect:/events";
		}
	}

}
