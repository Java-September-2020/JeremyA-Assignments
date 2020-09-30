package com.jeremyakatsa.license.services;

import org.springframework.stereotype.Service;

import com.jeremyakatsa.license.models.License;
import com.jeremyakatsa.license.models.Person;
import com.jeremyakatsa.license.repositories.LicenseRepository;
import com.jeremyakatsa.license.repositories.PersonRepository;

@Service
public class AppService {
	private final PersonRepository personRepo;
	private final LicenseRepository licenseRepo;
	
	public AppService (PersonRepository pRepo, 
			LicenseRepository lRepo) {
		this.personRepo = pRepo;
		this.licenseRepo = lRepo;
	}
	
	//locate individual people & licenses.
	public Person findPerson(Long id) {
		return personRepo.findById(id).orElse(null);
	}
	public License findLicense(Long id) {
		return licenseRepo.findById(id).orElse(null);
	}
	
	//create people & licenses.
	public Person createPerson(Person person) {
		return personRepo.save(person);
	}
	public License createLicense(License license) {
		return licenseRepo.save(license);
	}
	
}
