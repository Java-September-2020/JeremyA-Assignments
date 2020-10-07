package com.jeremyakatsa.dojooverflow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jeremyakatsa.dojooverflow.models.Questions;

public interface QuestionsRepository extends CrudRepository<Questions, Long>{
	List<Questions> findAll();

}
