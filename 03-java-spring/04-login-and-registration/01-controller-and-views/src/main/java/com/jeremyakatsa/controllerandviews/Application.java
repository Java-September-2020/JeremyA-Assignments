package com.jeremyakatsa.controllerandviews;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.jeremyakatsa.controllerandviews.repositories"})
@ComponentScan({"com.jeremyakatsa.controllerandviews.controllers"})
@ComponentScan({"com.jeremyakatsa.controllerandviews.models"})
@ComponentScan({"com.jeremyakatsa.controllerandviews.services"})

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
