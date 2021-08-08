package com.tulasi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="person")
@NoArgsConstructor
@Data
public class Person {

	@Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  private Long id;
	  private String userName;
	  private String firstName;
	  private String lastName;
	  private String password;
	  
	  
}
