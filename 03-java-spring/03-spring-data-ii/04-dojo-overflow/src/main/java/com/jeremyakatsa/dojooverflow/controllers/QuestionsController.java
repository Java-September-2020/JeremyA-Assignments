package com.jeremyakatsa.dojooverflow.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jeremyakatsa.dojooverflow.models.Questions;
import com.jeremyakatsa.dojooverflow.services.AppService;

@Controller
@RequestMapping("/")
public class QuestionsController {
	private final AppService appService;
	public QuestionsController(AppService service) {
		this.appService = service;
	}
	
	@GetMapping("")
	public String Redirect() {
		return "redirect:/questions";
	}
	
	@GetMapping("/questions") 
	public String Index(Model model){
		model.addAttribute("questions", appService.allQuestions());
		return "index.jsp";		
	}
	@GetMapping("/questions/new")
	public String NewQuestion(@ModelAttribute("question") Questions questions) {
		return "new.jsp";
	}

}
