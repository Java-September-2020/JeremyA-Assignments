package com.jeremyakatsa.dojooverflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.jeremyakatsa.dojooverflow.repositories"})
@ComponentScan({"com.jeremyakatsa.dojooverflow.controllers"})
@ComponentScan({"com.jeremyakatsa.dojooverflow.models"})
@ComponentScan({"com.jeremyakatsa.dojooverflow.services"})

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
