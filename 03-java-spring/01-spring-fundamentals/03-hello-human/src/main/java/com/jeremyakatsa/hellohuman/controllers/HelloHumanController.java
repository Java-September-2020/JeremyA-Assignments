package com.jeremyakatsa.hellohuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("")
public class HelloHumanController {
	
	@RequestMapping("/")
	public String helloHuman() {
		return index.jsp; 
	}
	
	@RequestMapping("/{name}")
	public String helloPerson(@RequestParam(value="q") String name) {
        return index2.jsp;
	}
	
}
