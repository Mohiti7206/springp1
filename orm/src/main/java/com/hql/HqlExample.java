package com.hql;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import states.Student;
import java.util.*;


public class HqlExample {

	public static void main(String[] args) {
		

		Configuration cg = new Configuration();
	    cg.configure("hibernate.cfg.xml");
	    SessionFactory factory = cg.buildSessionFactory();
	    Session s = factory.openSession();
	    
	    
	 //  String query = "from Student where city=:x";
	    
	    String query = "from Student as s where s.city=:x and s.name=:n";
	    
	    Query q = s.createQuery(query);
	    
	    q.setParameter("x","Karnal" );
	    q.setParameter("n", "mohit kumar");
	    
	    
	    @SuppressWarnings("deprecation")
		List<Student> list = q.list();
	    
	    for(Student  student: list) {
	    	System.out.println(student.getName() + " : " + student.getCity() + " : "+ student.getId());
	    }
	    
	    
	    
	    System.out.println( "------------------------------------------------------------------");
	    
	    Transaction tx = s.beginTransaction();
		/*
		 * // delete query Transaction tx = s.beginTransaction(); Query q2 =
		 * s.createQuery("delete from Student as s where s.city=:c"); q2.setParameter(
		 * "c", "karnal");
		 * 
		 * 
		 * int r = q2.executeUpdate(); System.out.println("Deleted");
		 * System.out.println(r); tx.commit();
		 */
	    
	    
	    
	 // update Query
	    Query q3 = s.createQuery("update Student set city=:c where name=:n");
	    q3.setParameter("c", "Delhi");
	    q3.setParameter("n", "Peter");
	    int r2 = q3.executeUpdate();
	    System.out.println(r2 + " Objects Updated");
	    tx.commit();
	    
	    
	    
	    
	    s.close();
	    factory.close();
	    
	}
}
























