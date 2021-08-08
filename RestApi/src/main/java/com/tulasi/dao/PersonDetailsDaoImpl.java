package com.tulasi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.tulasi.dao.repo.PersonDetailsRepo;
import com.tulasi.model.Person;


@Component
public class PersonDetailsDaoImpl implements PersonDetail{

	@Autowired
	PersonDetailsRepo personDetailsRepo;
	
	@Override
	public List<Person> getPersonInfo() {
		// TODO Auto-generated method stub
		return personDetailsRepo.findAll();
	}

	@Override
	public Person savePerson(Person person) {
		
		return personDetailsRepo.save(person);
	}

	@Override
	public void deletePerson(Long personId) {
		
		 personDetailsRepo.deleteById(personId);
	}

	@Override
	public Person getPersonByUserName(String userName) {
		// TODO Auto-generated method stub
		return personDetailsRepo.findByUserName(userName);
	}

}
