package com.springcore.javaconfig2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore.javaconfig")
public class javaconfig {
	
	@Bean
	public Samosa getSamosa() {
		
		return new Samosa();
	}
	@Bean(name = {"student", "temp", "con"})
	public Student getStudent() {
		
		Student s1 = new Student(getSamosa());
		return s1;
		
	}

}
