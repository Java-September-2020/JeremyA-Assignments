package com.jeremyakatsa.license.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jeremyakatsa.license.models.License;
import com.jeremyakatsa.license.services.AppService;

@Controller
@RequestMapping("/licenses")
public class LicenseController {
	private final AppService aService;
	public LicenseController(AppService service) {
		this.aService = service;
	}
	
	@GetMapping("")
	public String license() {
		return "license.jsp";
	}
	
	@PostMapping(value="/license")
	public String createLicense(@ModelAttribute("license") License license, BindingResult result) {
		aService.createLicense(license);
		return "show.jsp";
	}
	
	@GetMapping("/persons/{id}")
	public String getLicense(@PathVariable("id") Long id, Model model) {
		model.addAttribute("license", aService.findLicense(id));
		return "show.jsp";
	}

}
