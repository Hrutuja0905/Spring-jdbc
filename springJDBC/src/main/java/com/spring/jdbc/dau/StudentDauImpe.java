package com.spring.jdbc.dau;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.student;
import com.spring.jdbc.entity.StudentDau;

public class StudentDauImpe implements StudentDau {
	
	private JdbcTemplate jdbcTemplate;

	@Override
	public int insert(student student) {
		//Insert query
        
        String query = "insert into student(id,name,address) value(?,?,?)";
        
        int r = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getAddress());
		return r;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	

}
