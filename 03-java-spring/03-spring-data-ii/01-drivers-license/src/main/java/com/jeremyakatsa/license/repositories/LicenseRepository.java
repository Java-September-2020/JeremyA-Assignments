package com.jeremyakatsa.license.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jeremyakatsa.license.models.License;

public interface LicenseRepository extends CrudRepository<License, Long>{
	List<License> findAll();
}
