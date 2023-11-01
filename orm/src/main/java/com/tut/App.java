package com.tut;
import org.hibernate.cfg.Configuration;
import java.io.*;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App {
	public static void main(String[] args) throws Exception{		
		System.out.println( "Project Started");
	//	SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Configuration cg = new Configuration();
	    cg.configure("hibernate.cfg.xml");
	    SessionFactory factory = cg.buildSessionFactory();
	    
	    
	    //creating student
	    
	    Student st = new Student();
	    st.setId(102888);
	    st.setName("durgesh tiwari");
	    st.setCity("ynr");
	    System.out.println(st);
	    
	  //creating object of address class
	    
	    Address ad = new Address();
	    ad.setStreet("street1");
	    ad.setCity("DELHI");
	    ad.setX(12.11);
	    ad.setImage(null);
	    ad.setOpen(true);
	    ad.setAddedDate(new Date());
	    
	    //Reading image
	    FileInputStream fis = new FileInputStream("/home/mm1/Desktop/img1.jpeg");
	    byte[] data = new byte[fis.available()];
	    fis.read();
	    ad.setImage(data);
	    Session session = factory.openSession();
	    Transaction tx = session.beginTransaction();
	    session.save(st);
	    session.save(ad);
	    tx.commit();
	    
	    fis.close();
	    session.close();
	    System.out.println("Done");
	    
	    
	    
	    
	    
	    
	    
	    
	    //	    System.out.println(factory);
	    
	    //System.out.println(factory.isClosed());
	    

		
		}
}








