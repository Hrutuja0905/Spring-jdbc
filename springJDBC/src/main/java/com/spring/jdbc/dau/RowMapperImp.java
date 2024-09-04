package com.spring.jdbc.dau;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.Person;

public class RowMapperImp implements RowMapper<Person> {

	@Override
	public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		
		Person person = new Person();
		
		person.setId(rs.getInt(1));
		person.setName(rs.getString(2));
		person.setContact(rs.getString(3));
		
		return person;
		
	}

}
