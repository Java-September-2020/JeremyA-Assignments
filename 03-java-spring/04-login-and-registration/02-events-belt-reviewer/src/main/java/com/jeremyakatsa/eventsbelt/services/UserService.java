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
    
	public User findById(Long id) {
		return this.userRepository.findById(id).orElse(null);
	}
	public User registerUser(User user) {
		String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
		user.setPassword(hashed);
		return this.userRepository.save(user);
	}
	public User getUserByEmail(String email) {
		return this.userRepository.findByEmail(email);
	}
	public boolean authenticateUser(String email, String password) {
		User user = this.userRepository.findByEmail(email);
		if(user == null)
			return false;
		
		return BCrypt.checkpw(password, user.getPassword());
	}
   
}
