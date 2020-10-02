package com.jeremyakatsa.driverslicense;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.jeremyakatsa.driverslicense.repositories"})
@ComponentScan({"com.jeremyakatsa.driverslicense.controllers"})
@ComponentScan({"com.jeremyakatsa.driverslicense.models"})
@ComponentScan({"com.jeremyakatsa.driverslicense.services"})
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
