package com.jeremyakatsa.hellohuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HelloHumanController {
	@RequestMapping("")
	public String helloHuman() {
		return index.jsp; 
	}
}
