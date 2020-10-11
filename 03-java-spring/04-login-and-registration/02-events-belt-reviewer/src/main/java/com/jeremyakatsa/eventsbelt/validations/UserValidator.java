package com.jeremyakatsa.eventsbelt.validations;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import com.jeremyakatsa.eventsbelt.models.User;
import com.jeremyakatsa.eventsbelt.repositories.UserRepository;

@Component
public class UserValidator {
	private final UserRepository userRepository;
	
	public UserValidator(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    // 1
	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}
	
	public void validate(Object target, Errors errors) {
		User user = (User) target;
		
		if(!user.getPassword().equals(user.getPasswordConfirmation())) {
			errors.rejectValue("password", "Match", "Passwords do not match");
		}
		
		// Make sure email is unique in the DB
		if(this.userRepository.existsByEmail(user.getEmail())) {
			errors.rejectValue("email", "Unique", "Email is already taken");
		}
		

	}
}
