package com.spring.standalone.collections;

import org.springframework.beans.BeansException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/standalone/collections/aloneconfig.xml")) {
			
			  Person person1 = context.getBean("person1", Person.class);
			  System.out.println(person1);
			  System.out.println(person1.getFriends().getClass().getName());
			  System.out.println(); System.out.println();
			  System.out.println(person1.getFeesstructure()); System.out.println();
			  System.out.println(); System.out.println(person1.getProperties());
			 
			JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
			System.out.println("hello1");
			String query = "insert into student(id,name,city) values(?,?,?)";
			System.out.println("hello2");
			int result = template.update(query, 797, "nona kumar", "kanpur"  );
			System.out.println("hello3");
			System.out.println("number of records inserted.." + result);
			
			
					
			
			
			
			
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}
	
	

}
