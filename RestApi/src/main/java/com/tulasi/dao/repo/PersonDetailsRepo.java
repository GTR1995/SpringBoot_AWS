package com.tulasi.dao.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tulasi.model.Person;

public interface PersonDetailsRepo extends JpaRepository<Person, Long>{

	
	Person findByUserName(String userName);
	
	
}
