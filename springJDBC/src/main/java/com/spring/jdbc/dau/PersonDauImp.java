package com.spring.jdbc.dau;


import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.Person;
import com.spring.jdbc.student;
import com.spring.jdbc.entity.PersonDau;

public class PersonDauImp implements PersonDau {
	
	private JdbcTemplate jdbcTemplate;

	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insert(Person person) {
		
		String query = "insert into person(id, name , contact) values(?,?,?)";
		
		int result = this.jdbcTemplate.update(query,person.getId(),person.getName(),person.getContact());
		
		return result;
	}

	@Override
	public int update(Person person) {
		
		String query = "update person set name= ?, contact = ? where id = ?";
		
		int result = this.jdbcTemplate.update(query,person.getName(),person.getContact(),person.getId());
		
		return result;
	}

	@Override
	public int delete(int id) {
		
		String query = "Delete from person where id=?";
		
		int result = this.jdbcTemplate.update(query,id);
		
		return result;
	}

	@Override
	public Person getPerson(int personid) {
		
		String query = "select * from person where id = ?";
		
		RowMapper<Person> rowMapper = new RowMapperImp();
		
		Person person =this.jdbcTemplate.queryForObject(query, rowMapper, personid);
		
		return person;
	}

	@Override
	public List<Person> getallPerson() {
		
		String query = "select * from person";
		
		List<Person> persons = this.jdbcTemplate.query(query, new RowMapperImp());
		
		return persons;
	}
	
	
	


	

}
