package com.jeremyakatsa.hellohuman.controllers;

import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/")
public class HelloHumanController {
	@RequestMapping("")
	public String helloHuman() {
		return index.jsp;
	}
}
