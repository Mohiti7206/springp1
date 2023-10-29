package com.springcore.stereotype;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.*;
import org.springframework.*;
import org.springframework.beans.factory.annotation.Value;



@Component("ob")
public class Student {
	
	@Value("mohit kumar")
	private String studentName;
	@Value("ynr")
	private String city;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + "]";
	}
	
	
	

}
