package com.spring.jdbc2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc2.dao.StudentDao;
import com.spring.jdbc2.dao.StudentDaoImpl;

@Configuration
public class JdbcConfig {

	@Bean("ds")
	public DriverManagerDataSource getDataSource()
	{
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc?useSSL=false");
		ds.setUsername("mm1");
		ds.setPassword("111");
		
		return ds;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate()
	{
		JdbcTemplate obj = new JdbcTemplate();
		obj.setDataSource(getDataSource());
		return obj;
		
	}
	
	
	
	@Bean("studentDao")
	public StudentDao getStudentDao() {
		StudentDaoImpl studentDao = new StudentDaoImpl();
		studentDao.setJdbcTemplate(getTemplate());
		return studentDao;
	}
}













