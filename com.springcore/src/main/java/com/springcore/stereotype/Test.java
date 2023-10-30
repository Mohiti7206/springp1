package com.springcore.stereotype;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereo.xml");
		
		Student student = context.getBean("ob", Student.class);
		System.out.println(student.hashCode());
		
		System.out.println(student);
		System.out.println(student.getAddress());
		System.out.println(student.getAddress().getClass().getName());
		
		
		
		Student student2 = context.getBean("ob", Student.class);
		System.out.println(student2.hashCode());
		
		Teacher t1 = context.getBean("teacher",Teacher.class);
		Teacher t2 = context.getBean("teacher",Teacher.class);
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		
		

		
		
		
		
		
		
		
		
		
				
	}

}





