package com.jeremyakatsa.routing.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class DojoController {
	@RequestMapping("/{dojo}")
	public String dojo(@PathVariable String dojo) {
		return "The dojo is awesome!";
	}
	@RequestMapping("/{dojo}/{burbank}")
	public String burbank(@PathVariable String burbank) {
		return "Burbank Dojo is located in Southern California!";
	}
	@RequestMapping("/dojo/{san-jose}")
	public String sanJose(@PathVariable("san-jose") String sanJose, Model model) {
				model.addAttribute("san-jose", sanJose);
		return "SJ dojo is the headquarters!";
	}
}
