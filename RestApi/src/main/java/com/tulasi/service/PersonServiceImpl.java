package com.tulasi.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.tulasi.dao.PersonDetail;
import com.tulasi.model.Person;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	PersonDetail personDao;

	@Override
	public List<Person> getAllPersons() {
		// TODO Auto-generated method stub
		return personDao.getPersonInfo();
	}

	@Override
	public Person savePerson(Person person) {
		// TODO Auto-generated method stub
		return personDao.savePerson(person);
	}

	@Override
	public void DeletePerson(Long id) {
		personDao.deletePerson(id);
		
	}

	@Override
	public Person getAPerson(Person person) {
		// TODO Auto-generated method stub
		 Person personDb = personDao.getPersonByUserName(person.getUserName());
	
		return personDb;
	}

	
}
