package com.tulasi.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.tulasi.model.Person;

@Component
public interface PersonService {

	List<Person> getAllPersons();
	
	Person savePerson(Person person);
	
	void DeletePerson(Long id);
	
	Person getAPerson(Person person);
}
