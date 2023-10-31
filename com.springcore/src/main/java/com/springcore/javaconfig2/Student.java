package com.springcore.javaconfig2;

import org.springframework.stereotype.Component;


@Component("firststudent")
public class Student {
	
	private Samosa obj;
	

	public Student(Samosa obj) {
		super();
		this.obj = obj;
	}


	public Samosa getObj() {
		return obj;
	}


	public void setObj(Samosa obj) {
		this.obj = obj;
	}


	void study() {
		// TODO Auto-generated method stub
		this.obj.display();
		System.out.println("student is reading book");
		

	}

   
	
	
}
