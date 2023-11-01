package com.tut;
import org.hibernate.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class FetchDemo {

	public static void main(String[] args) {
		// get ,  load
		
		Configuration cg = new Configuration();
	    cg.configure("hibernate.cfg.xml");
	    SessionFactory factory = cg.buildSessionFactory();
	    
	    
	    Session session = factory.openSession();
	    
	    Student student = (Student)session.get(Student.class,1212);
	    System.out.println(student);
	    
	    Address ad = (Address)session.get(Address.class, 2);
	    System.out.println(ad.getStreet()+ "  :  " + ad.getCity());
	    
	    
	    
	    
	    
	    
	    
	    
	    session.close();
	    

	}

}















