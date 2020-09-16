package com.jeremyakatsa.routing.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class DojoController {
	@RequestMapping("/{dojo}")
	public String hello(@PathVariable String dojo) {
		return "Hello Coding Dojo!";
	}
}
