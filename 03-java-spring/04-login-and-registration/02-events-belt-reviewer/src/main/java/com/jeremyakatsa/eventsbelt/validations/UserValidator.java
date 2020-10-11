package com.jeremyakatsa.eventsbelt.validations;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.jeremyakatsa.eventsbelt.models.User;
import com.jeremyakatsa.eventsbelt.repositories.UserRepository;

@Component
public class UserValidator implements Validator {
	private final UserRepository userRepository;
	
	public UserValidator(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    @Override
	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}
	
    @Override
	public void validate(Object target, Errors errors) {
		User user = (User) target;
		
		// Make sure email is unique in the DB
		if(this.userRepository.findByEmail(user.getEmail()) != null ) {
			errors.rejectValue("email", "Unique", "already taken");
		}
		
		if(!user.getPassword().equals(user.getPasswordConfirmation())) {
			errors.rejectValue("password", "Unique", "must match original Password");
		}
		

	}
}
