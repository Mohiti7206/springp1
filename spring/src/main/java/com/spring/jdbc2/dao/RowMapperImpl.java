package com.spring.jdbc2.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc2.entities.Student;

public class RowMapperImpl  implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		
		Student student = new Student();
		student.setId(arg0.getInt(1));
		student.setName(arg0.getString(2));
		student.setCity(arg0.getString(3));		
		return student;
	}
	
	 

}
