package com.jeremyakatsa.dojosninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.jeremyakatsa.dojosninjas.models.Dojo;
import com.jeremyakatsa.dojosninjas.models.Ninja;
import com.jeremyakatsa.dojosninjas.services.AppService;

@Controller
public class MainController {

	private final AppService service;
	public MainController(AppService serv) {
		this.service = serv;
		}
	
	@GetMapping("/dojos/new")
	public String index(@ModelAttribute("dojo") Dojo dojo) {
		return "new.jsp";
	}
	
	@PostMapping("/dojos")
	public String CreateDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "new.jsp";
		}
		service.createDojo(dojo);
		return "redirect:/ninjas/new";
	}
	@GetMapping("/ninjas/new")
	public String NewNinjas(@ModelAttribute("ninja") Ninja ninja, Model model) {
		List<Dojo> ninjadojos = service.getDojos();
		model.addAttribute("dojos", ninjadojos);
		return "/ninjas/new.jsp";
	}
	@PostMapping("/ninjas")
	public String CreateNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if(result.hasErrors()) {
			return "/ninjas/new.jsp";
		}
		service.createNinja(ninja);
		return "redirect:/dojos/{id}";
	}
	@GetMapping("/dojos/{id}")
	public String ShowNinjas(@PathVariable("id") Long id, Model model) {
		List<Ninja> ninjas = service.getNinjas();
		model.addAttribute("ninja", ninjas);
		return "show.jsp";
	}
}
