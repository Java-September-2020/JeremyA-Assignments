package com.jeremyakatsa.license.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jeremyakatsa.license.models.Person;
import com.jeremyakatsa.license.services.AppService;

@Controller
@RequestMapping("/persons")
public class PersonController {
	private final AppService aService;
	public PersonController(AppService service) {
		this.aService = service;
	}
	
	@GetMapping("/new")
	public String person() {
		return "person.jsp";
	}
	
	@PostMapping(value="/persons")
	public String createPerson(@ModelAttribute("person") Person person) {
		aService.createPerson(person);
		return "license.jsp";		
	}
}
