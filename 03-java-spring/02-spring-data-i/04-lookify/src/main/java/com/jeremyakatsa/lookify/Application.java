package com.jeremyakatsa.lookify;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.jeremyakatsa.lookify.repositories"})
@ComponentScan({"com.jeremyakatsa.lookify.controllers"})
@ComponentScan({"com.jeremyakatsa.lookify.models"})
@ComponentScan({"com.jeremyakatsa.lookify.services"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
