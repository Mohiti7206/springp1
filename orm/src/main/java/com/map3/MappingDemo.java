package com.map3;

import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Configuration cg = new Configuration();
	    cg.configure("hibernate.cfg.xml");
	    SessionFactory factory = cg.buildSessionFactory();
	    
	    Emp e1 = new Emp();
	    Emp e2 = new Emp();
	    
	    e1.setEid(38);
	    e1.setName("Ram");
	    e2.setEid(39);
	    e2.setName("Shyam");
	    
	    
	    Project p1 = new Project();
	    Project p2 = new Project();
	    p1.setPid(1212214);
	    p1.setProjectName("Library Management System");
	    p2.setPid(1212217);
	    p2.setProjectName("ChatBoat");
	    
	    
	    
	    List<Emp> list1 = new ArrayList<Emp>();
	    List<Project> list2 = new ArrayList<Project>();
	    
	    list1.add(e1);
	    list1.add(e2);
	    
	    list2.add(p1);
	    list2.add(p2);
	    
	    
	    e1.setProject(list2);
	    p2.setEmps(list1);
	    
	    
	    Session s = factory.openSession();
	    Transaction tx = s.beginTransaction();
	    s.save(e1);
	    s.save(p2);
	    s.save(p1);
	    s.save(e2);
	    
	    
	    
	    tx.commit();
	    factory.close();
	    

	}

}
