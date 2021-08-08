package com.tulasi.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tulasi.model.Person;
import com.tulasi.service.PersonService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class KarthiController {

	@Autowired
	PersonService personService;
	
	@GetMapping("/getAllUsers")
	List<Person> getPersons(){
		return personService.getAllPersons();
	}
	
	@PostMapping("/saveUser")
	Person savePerson(@RequestBody Person person) {
		return personService.savePerson(person);
	}
	
	@GetMapping("/hi")
	String sayHi() {
		return "Hi Karthi";
	}
	
	@PostMapping("/login")
	ResponseEntity login(@RequestBody Person person) {
		
		Person personDb =personService.getAPerson(person);
		if(Objects.isNull(personDb)) {
			 return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Invalid");
		 } else {
			 
			 if(person.getPassword().equals(personDb.getPassword())){
				 return ResponseEntity.status(HttpStatus.OK).body(personDb);
			 }
		 }
		return null;
	}
	
	
}
