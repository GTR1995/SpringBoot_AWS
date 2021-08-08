package com.tulasi.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.tulasi.model.Person;


@Component
public interface PersonDetail {

	List<Person> getPersonInfo();
	
	Person savePerson(Person person);
	
	void deletePerson(Long personId);
	
	Person getPersonByUserName(String userName);
}
