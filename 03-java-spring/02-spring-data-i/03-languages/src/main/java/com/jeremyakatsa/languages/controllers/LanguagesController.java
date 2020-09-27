package com.jeremyakatsa.languages.controllers;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jeremyakatsa.languages.models.Language;
import com.jeremyakatsa.languages.services.LanguagesService;


@Controller
@RequestMapping("/languages")
public class LanguagesController {
	private final LanguagesService langService;
	
	public LanguagesController(LanguagesService service) {
		this.langService = service;
	}
	
	@RequestMapping("/")
	public String index(@ModelAttribute("language") Language language, Model model) {
		model.addAttribute("languages", langService.allLanguages());
		return "/index.jsp";
	}
//	@RequestMapping("/") 
//	 public String index(Model model) { 
//		 List<Language> languages = langService.allLanguages();
//		 model.addAttribute("languages", languages); 
//		 return "/index.jsp"; 
//	 }
	 
	
	@RequestMapping("/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		model.addAttribute("language", langService.findLanguage(id));
		return "show.jsp";
	}

	@RequestMapping(value="/", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute("language") Language lang, BindingResult result, @RequestParam Map<String,String> body) {
		if(result.hasErrors())
			return "index.jsp";
		else {
			langService.createLanguage(lang);
			return "redirect:/";
		}
	}
	@RequestMapping("/edit/{id}")
	public String edit(@PathVariable("id") Long id, Model model) {
		model.addAttribute("language", langService.findLanguage(id));
		return "edit.jsp";
	}
	@RequestMapping(value="{id}", method=RequestMethod.PUT)
	public String update(@Valid @ModelAttribute("language") Language lang, BindingResult result) {
		if(result.hasErrors())
			return "edit.jsp";
		else 
		langService.updateLanguage(lang);
		return "redirect:/";
	}
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		this.langService.deleteLanguage(id);
		return "redirect:/";
	}
}
