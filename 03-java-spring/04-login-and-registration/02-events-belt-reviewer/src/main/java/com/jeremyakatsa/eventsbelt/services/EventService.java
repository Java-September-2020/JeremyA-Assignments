package com.jeremyakatsa.eventsbelt.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeremyakatsa.eventsbelt.models.Event;
import com.jeremyakatsa.eventsbelt.models.User;
import com.jeremyakatsa.eventsbelt.repositories.EventRepository;

@Service
public class EventService {
	@Autowired
	private EventRepository eRepo;
	
	public List<Event> allEventsWithState(String state) {
		return this.eRepo.findByState(state);
	}
	
	public List<Event> allEventsNotState(String state) {
		return this.eRepo.findByStateIsNot(state);
	}
	
	public Event findById(Long id) {
		return this.eRepo.findById(id).orElse(null);
	}
	public Event create(Event event) {
		return this.eRepo.save(event);
	}
	
	public Event update(Event event) {
		return this.eRepo.save(event);
	}
	public void delete(Long id) {
		this.eRepo.deleteById(id);
	}
	public void joinEvent(User user, Event event) {
		// Get the list from the Event
		List<User> users = event.getUsersJoined();
		// Add the User who joined the event
		users.add(user);
		// Update 
		this.eRepo.save(event);
	}
	
	public void cancelEvent(User user, Event event) {
		// Get the list from the Event
		List<User> users = event.getUsersJoined();
		// Remove the User who joined the event
		users.remove(user);
		// Update 
		this.eRepo.save(event);
	}
	
}
