package com.jeremyakatsa.eventsbelt.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jeremyakatsa.eventsbelt.models.User;

public interface UserRepository extends CrudRepository<User, Long> {
	List<User> findAll(); 
    User findByEmail(String email); 
    boolean existsByEmail(String email); 
}
