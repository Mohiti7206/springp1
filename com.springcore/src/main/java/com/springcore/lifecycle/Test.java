package com.springcore.lifecycle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


import com.springcore.ci.Person;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		
		/*
		 * Samosa s1 = (Samosa) context.getBean("s1"); System.out.println(s1);
		 */
		context.registerShutdownHook();
		
		System.out.println("------------------");
		
		/*
		 * Pepsi obj = (Pepsi)context.getBean("p1");
		 * 
		 * System.out.println(obj);
		 * 
		 * 
		 */
		
		
		Bread b1 = (Bread)context.getBean("c1");
		System.out.println(b1);
		
		
		
		
		
		
		
	
		
		
		
	}
	

}
