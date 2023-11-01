package states;

import org.hibernate.cfg.Configuration;
import org.hibernate.*;



public class StateDemo {

	public static void main(String[] args) {
		// Practical of Hibernate Object States:
		// Transient 
		// Persistent
		// Removed
		System.out.println("Example :  ");
		
		SessionFactory f = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		
		Student st  = new Student();
		st.setId(1414);
		st.setName("Peter");
		st.setCity("Petersbourgh");
		st.setCerti(new Certificate("java hibernate Course" ,  "2 months"));
		// student : Transient 
		
		
		Session s = f.openSession();
		Transaction tx = s.beginTransaction();
		s.save(st);
		// student : Persistent - session, database
		
		st.setName("john");
		tx.commit();
		
		s.close();
		// student : Detached
		st.setName("sachin");
		
		f.close();
		
		
	}

}



















