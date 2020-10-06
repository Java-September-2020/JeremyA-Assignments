package com.jeremyakatsa.productsandcategories;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.jeremyakatsa.productsandcategories.repositories"})
@ComponentScan({"com.jeremyakatsa.productsandcategories.controllers"})
@ComponentScan({"com.jeremyakatsa.productsandcategories.models"})
@ComponentScan({"com.jeremyakatsa.productsandcategories.services"})
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
