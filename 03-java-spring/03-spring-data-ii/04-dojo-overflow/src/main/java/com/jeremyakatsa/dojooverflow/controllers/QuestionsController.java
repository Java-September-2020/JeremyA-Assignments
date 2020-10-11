package com.jeremyakatsa.dojooverflow.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jeremyakatsa.dojooverflow.models.Questions;
import com.jeremyakatsa.dojooverflow.models.Tags;
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
	
	@PostMapping("/question")
	public String CreateQuestion(
			@Valid @ModelAttribute("question") Questions questions,	BindingResult result) {
		if(result.hasErrors())
			return "new.jsp";
		this.appService.createQuestion(questions);
		return "redirect:/";
	}

}
