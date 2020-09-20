package com.jeremyakatsa.code.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CodeController {
	@RequestMapping("")
	public String Index() {
		return "index.jsp";
	}

}
