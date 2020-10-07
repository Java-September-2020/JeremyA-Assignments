package com.jeremyakatsa.dojooverflow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jeremyakatsa.dojooverflow.models.Tags;

public interface TagsRepository extends CrudRepository <Tags, Long>{
	List<Tags> findAll();

}
