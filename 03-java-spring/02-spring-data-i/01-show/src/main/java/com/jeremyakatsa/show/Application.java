package com.jeremyakatsa.show;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.jeremyakatsa.show.models"})
@ComponentScan({"com.jeremyakatsa.show.repositories"})
@ComponentScan({"com.jeremyakatsa.show.services"})
@ComponentScan({"com.jeremyakatsa.show.controllers"})
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
