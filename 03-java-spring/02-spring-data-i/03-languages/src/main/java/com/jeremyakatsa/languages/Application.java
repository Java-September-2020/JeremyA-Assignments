package com.jeremyakatsa.languages;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.jeremyakatsa.languages.repositories"})
@ComponentScan({"com.jeremyakatsa.languages.controllers"})
@ComponentScan({"com.jeremyakatsa.languages.models"})
@ComponentScan({"com.jeremyakatsa.languages.services"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
