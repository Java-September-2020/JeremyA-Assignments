package com.jeremyakatsa.updatedelete;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.jeremyakatsa.updatedelete.models"})
@ComponentScan({"com.jeremyakatsa.updatedelete.repositories"})
@ComponentScan({"com.jeremyakatsa.updatedelete.services"})
@ComponentScan({"com.jeremyakatsa.updatedelete.controllers"})
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
