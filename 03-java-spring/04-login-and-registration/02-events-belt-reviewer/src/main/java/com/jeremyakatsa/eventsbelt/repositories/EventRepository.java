package com.jeremyakatsa.eventsbelt.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.jeremyakatsa.eventsbelt.models.Event;

public interface EventRepository extends CrudRepository<Event, Long>{
	List<Event> findAll();
	Optional<Event> findById(Long id); 

}
