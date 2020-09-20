package com.jeremyakatsa.code.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/")
public class CodeController {
	private Boolean isCorrectCode(String guess) {
		return guess.equals("bushido");
	}
	private String[] getCodes() {
		return new String[] {
		"Loyalty", "Courage", "Veracity", "Compassion", "Honor"	
		};
	}
	
	@GetMapping("")
	public String Index() {
		return "index.jsp";
		
	}
	@PostMapping("/findcode")
	public String findCode(@RequestParam(value="guess") String guess, 
			Model model, RedirectAttributes rAttributes) {
		if(isCorrectCode(guess)) {
			return "redirect:/code";
		}
		rAttributes.addFlashAttribute("error", "You do not know the way");
		return "redirect:/";
	}
	@RequestMapping("/code")
	public String Code(Model model) {
		model.addAttribute("code", getCodes());
		return "code.jsp";
	}
}
