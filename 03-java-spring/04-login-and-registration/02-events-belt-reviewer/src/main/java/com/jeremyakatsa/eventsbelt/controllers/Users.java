package com.jeremyakatsa.eventsbelt.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jeremyakatsa.eventsbelt.models.User;
import com.jeremyakatsa.eventsbelt.services.UserService;
import com.jeremyakatsa.eventsbelt.validations.UserValidator;

@Controller
@RequestMapping("/")
public class Users {
    private final UserService userService;
    private final UserValidator userValidator;
    
    public Users(UserService userService, UserValidator userValidator) {
        this.userService = userService;
        this.userValidator = userValidator;
    }
    
    @GetMapping("")
    public String Index(@ModelAttribute("user") User user) {
        return "/users/index.jsp";
    }
    
    @PostMapping("/")
    public String Register(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
    	userValidator.validate(user, result);
        // if result has errors, return the registration page
    	if(result.hasErrors())
    		return "/users/index.jsp";
        // else, save the user in the database, save the user id in session, and redirect them to the /home route
    	User newUser = userService.registerUser(user);
    	session.setAttribute("userId", newUser.getId());
    	return "redirect:/events";
    }
    
    @PostMapping("/login")
    public String Login(@RequestParam("email") String email, @RequestParam("password") 
    String password, HttpSession session, RedirectAttributes redirs) {
        // if the user is authenticated, save their user id in session
    	if(this.userService.authenticateUser(email, password)) {
    		User user = userService.findByEmail(email);
    		session.setAttribute("userId", user.getId());
			return "redirect:/events";
		}
    	// else, add error messages and return the login page
    	redirs.addFlashAttribute("error", "Invalid Email/Password Match");
    	return "login.jsp";
    }
    
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        // invalidate session
    	session.invalidate();
        // redirect to login page
    	return "redirect:";
    }
}
