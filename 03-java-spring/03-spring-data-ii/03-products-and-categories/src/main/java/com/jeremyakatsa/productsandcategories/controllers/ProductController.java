package com.jeremyakatsa.productsandcategories.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jeremyakatsa.productsandcategories.models.Association;
import com.jeremyakatsa.productsandcategories.models.Category;
import com.jeremyakatsa.productsandcategories.models.Product;
import com.jeremyakatsa.productsandcategories.services.AppService;

@Controller
public class ProductController {
	private AppService appService;
	public ProductController(AppService service) {
		this.appService = service;
		
	}
	@GetMapping("/")
	public String Index() {
		return "redirect:/products";
	}
	
	@GetMapping("/products")
	public String ProductIndex(@ModelAttribute("product") Product product) {
		return "/products/index.jsp";
	}
//	@GetMapping("/{id}")
//	public String Show(@ModelAttribute("product") Association association, 
//		@PathVariable("id") Long id, Model model) {
//		Product thisOne = appService.getProduct(id);
//		List<Category> others = appService.findCategoriesNotInProduct(thisOne);
//		model.addAttribute("product", thisOne);
//		model.addAttribute("notInCategories", others);
//		return "/products/show.jsp";
//	}
}
