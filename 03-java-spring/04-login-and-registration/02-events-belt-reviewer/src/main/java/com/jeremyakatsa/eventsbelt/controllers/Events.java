package com.jeremyakatsa.eventsbelt.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jeremyakatsa.eventsbelt.models.User;
import com.jeremyakatsa.eventsbelt.services.UserService;
import com.jeremyakatsa.eventsbelt.validations.UserValidator;

@Controller
@RequestMapping ("/events")
public class Events {
	@GetMapping("")
	public String Index() {
		return "/events/index.jsp";
	}
//	@Autowired
//	private final UserService userService;
//	@Autowired
//    private final UserValidator eventService;
//    
//	
//	@GetMapping("")
//    public String Index(HttpSession session, Model model) {
//        // get user from session, save them in the model and return the home page
//    	Long userId = (Long)session.getAttribute("userId");
//		User user = userService.findUserById(userId);
//		model.addAttribute("user", user);
//		return "home.jsp";
//    }

}
