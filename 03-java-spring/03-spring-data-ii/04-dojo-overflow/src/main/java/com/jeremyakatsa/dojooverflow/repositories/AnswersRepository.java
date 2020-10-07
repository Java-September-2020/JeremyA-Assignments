package com.jeremyakatsa.dojooverflow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jeremyakatsa.dojooverflow.models.Answers;

public interface AnswersRepository extends CrudRepository<Answers, Long>{
	List<Answers> findAll();
}
