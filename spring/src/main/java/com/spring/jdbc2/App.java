package com.spring.jdbc2;

import org.springframework.beans.BeansException;
import java.util.*;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc2.dao.StudentDao;
import com.spring.jdbc2.entities.Student;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		
		try (AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc2/aloneconfig.xml")) 
		{
			/*
			 * 
			 * JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
			 * 
			 * String query = "insert into student(id,name,city) values(?,?,?)";
			 * 
			 * int result = template.update(query, 802, "sona kumari", "manipur" );
			 * 
			 * System.out.println("number of records inserted.." + result);
			 */
					
			StudentDao studentDao = context.getBean("studentDao" , StudentDao.class);
			
			/*  // insert
			 * Student student = new Student(); student.setId(888);
			 * student.setName("mohit"); student.setCity("ynr");
			 * 
			 * int result = studentDao.insert(student);
			 * 
			 * System.out.println("student added "+ result);
			 */
			
			
			
			/*
			 * // update Student student1 = new Student(); student1.setId(888);
			 * student1.setName("kamal furniture"); student1.setCity("ladwa"); int result1 =
			 * studentDao.change(student1); System.out.println("data changed = "+ result1);
			 * 
			 * 
			 * //delete int result2 = studentDao.delete(888);
			 * System.out.println("studnet deleted = "+result2);
			 * 
			 * 
			 * 
			 */
			
			/*  // get a single student data by its id 
			 * Student student = studentDao.getStudent(789); System.out.println(student);
			 */
			
			
			
			 // getting all students data 
			List<Student> l1 = studentDao.getAllStudents();
			for(Student s:l1)
			{
				System.out.println(s);
			}
			
			
			
			
			
			
			
			
			
			
			
		} catch (BeansException e) {
			e.printStackTrace();
		}
		
		
		
		

	}
	
	

}
