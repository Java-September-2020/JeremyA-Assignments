package com.jeremyakatsa.controllerandviews.repositories;

import org.springframework.data.repository.CrudRepository;

import com.jeremyakatsa.controllerandviews.models.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByEmail(String email);
}
