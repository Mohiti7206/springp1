package com.springcore.standalone.collections;

import org.springframework.beans.BeansException;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/aloneconfig.xml")) {
			Person person1 = context.getBean("person1", Person.class);
			System.out.println(person1);
			System.out.println(person1.getFriends().getClass().getName());
			System.out.println();
			System.out.println();
			System.out.println(person1.getFeesstructure());
			System.out.println();
			System.out.println();
			System.out.println(person1.getProperties());
			
			
			
			
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}
	
	

}
