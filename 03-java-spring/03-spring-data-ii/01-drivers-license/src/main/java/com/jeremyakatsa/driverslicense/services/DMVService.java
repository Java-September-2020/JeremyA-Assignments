package com.jeremyakatsa.driverslicense.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jeremyakatsa.driverslicense.models.License;
import com.jeremyakatsa.driverslicense.models.Person;
import com.jeremyakatsa.driverslicense.repositories.LicenseRepository;
import com.jeremyakatsa.driverslicense.repositories.PersonRepository;

@Service
public class DMVService {
	private final PersonRepository personRepo;
	private final LicenseRepository licenseRepo;
	public DMVService(PersonRepository pRepo, LicenseRepository licRepo) {
		this.personRepo = pRepo;
		this.licenseRepo = licRepo;
	}
	public Person getPerson(Long id) {
		return personRepo.findById(id).orElse(null);
	}
	public List<Person> getPeople() {
		return personRepo.findAll();
	}
	public List<Person> getUnlicensedPeople() {
		return personRepo.findByLicenseIdIsNull();
	}
	public Person createPerson(Person p) {
		return personRepo.save(p);
	}
	public License createLicense(License l) {
		l.setNumber(this.generateLicenseNumber());
		return licenseRepo.save(l);
	}
	public int generateLicenseNumber() {
		License l = licenseRepo.findTopByOrderByNumberDesc();
		if(l == null)
			return 1;
		int largestNumber = l.getNumber();
		largestNumber++;
		return (largestNumber);
	}
}
