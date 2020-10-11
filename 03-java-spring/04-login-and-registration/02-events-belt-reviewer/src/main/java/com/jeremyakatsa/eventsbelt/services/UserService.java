package com.jeremyakatsa.eventsbelt.services;


import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

import com.jeremyakatsa.eventsbelt.models.User;
import com.jeremyakatsa.eventsbelt.repositories.UserRepository;

@Service
public class UserService {
	private final UserRepository userRepository;
    
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    // register user and hash their password
    public User registerUser(User user) {
        String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
        user.setPassword(hashed);
        return userRepository.save(user);
    }
    
    // find user by id
    public User findUserById(Long id) {
    	return this.userRepository.findById(id).orElse(null);
    }
    
    // find user by email
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
    
    // authenticate user
    public boolean authenticateUser(String email, String password) {
        // first find the user by email
        User user = userRepository.findByEmail(email);
        // if we can't find it by email, return false
        if(user == null) {
            return false;
        } else {
            // if the passwords match, return true, else, return false
            if(BCrypt.checkpw(password, user.getPassword())) {
                return true;
            } else {
                return false;
            }
        }
    }
}
