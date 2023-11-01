package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {

	
	public static void main(String[] args) {
		
		Configuration cg = new Configuration();
	    cg.configure("hibernate.cfg.xml");
	    SessionFactory factory = cg.buildSessionFactory();
	    
	    Student student1 = new Student();
	    student1.setId(1212);
	    student1.setName("Ankit tiwari");
	    student1.setCity("Banglore");
	    
	    Certificate certificate = new Certificate();
	    certificate.setCourse("Android");
	    certificate.setDuration("2 months");
	    
	    
	    student1.setCerti(certificate);
	    
	    
	    Session s = factory.openSession();
	    Transaction tx = s.beginTransaction();
	    
	    s.save(student1);
	    
	    tx.commit();
	    s.close();
	    
	    
	    factory.close();
	    
		
	}
}
