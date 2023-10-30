package com.springcore.stereotype;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.*;
import org.springframework.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;

import java.util.*;




@Component("ob")
@Scope("prototype")
public class Student {
	
	@Value("mohit kumar")
	private String studentName;
	@Value("ynr")
	private String city;

	@Value("#{temp}")
	private List<String> address;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + "]";
	}
	
	
	

}
