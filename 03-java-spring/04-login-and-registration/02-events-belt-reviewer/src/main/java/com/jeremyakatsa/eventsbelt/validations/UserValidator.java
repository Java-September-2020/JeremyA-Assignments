package com.jeremyakatsa.eventsbelt.validations;

import javax.validation.Validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import com.jeremyakatsa.eventsbelt.models.User;

@Component
public abstract class UserValidator implements Validator {
    
    // 1
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }
    
    // 2
    public void validate(Object target, Errors errors) {
        User user = (User) target;
        
        if (!user.getPasswordConfirmation().equals(user.getPassword())) {
            // 3
            errors.rejectValue("passwordConfirmation", "Match");
        }         
    }
}
