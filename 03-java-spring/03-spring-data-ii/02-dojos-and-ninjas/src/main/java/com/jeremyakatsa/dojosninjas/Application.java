package com.jeremyakatsa.dojosninjas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.jeremyakatsa.dojosninjas.repositories"})
@ComponentScan({"com.jeremyakatsa.dojosninjas.controllers"})
@ComponentScan({"com.jeremyakatsa.dojosninjas.models"})
@ComponentScan({"com.jeremyakatsa.dojosninjas.services"})
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
