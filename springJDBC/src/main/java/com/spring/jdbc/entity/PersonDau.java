package com.spring.jdbc.entity;

import java.util.List;

import com.spring.jdbc.Person;

public interface PersonDau {
	
	public int insert(Person person);
	
	public int update(Person person);

	public int delete(int id);

	public Person getPerson(int personid);
	
	public List<Person> getallPerson(); 
}
