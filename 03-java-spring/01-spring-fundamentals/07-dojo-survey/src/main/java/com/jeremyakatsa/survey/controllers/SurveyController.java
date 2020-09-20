package com.jeremyakatsa.survey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class SurveyController {
	@GetMapping("")
	public String Index() {
		return "index.jsp";
	}

}
