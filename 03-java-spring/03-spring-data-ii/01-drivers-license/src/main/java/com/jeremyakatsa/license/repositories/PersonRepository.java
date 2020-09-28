package com.jeremyakatsa.license.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jeremyakatsa.license.models.Person;

public interface PersonRepository extends CrudRepository<Person, Long>{
	List<Person> findAll();

}
