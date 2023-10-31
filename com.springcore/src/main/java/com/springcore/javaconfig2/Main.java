package com.springcore.javaconfig2;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//	AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/javaconfig/config.xml");
		
		try (AbstractApplicationContext context = new AnnotationConfigApplicationContext(javaconfig.class)) {
			Student student  = context.getBean("student", Student.class);
			//			Student student  = context.getBean("con", Student.class);
			//      	Student student  = context.getBean("temp", Student.class);
			
			
			System.out.println(student);
			student.study();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
   
	}
}
