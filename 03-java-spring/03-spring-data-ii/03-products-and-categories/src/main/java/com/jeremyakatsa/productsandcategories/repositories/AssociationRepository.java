package com.jeremyakatsa.productsandcategories.repositories;



import org.springframework.data.repository.CrudRepository;

import com.jeremyakatsa.productsandcategories.models.Association;

public interface AssociationRepository extends CrudRepository <Association, Long> {


}
