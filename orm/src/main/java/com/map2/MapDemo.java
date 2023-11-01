package com.map2;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.*;
import org.hibernate.*;

public class MapDemo {
	public static void main(String[] args) {
		

		Configuration cg = new Configuration();
	    cg.configure("hibernate.cfg.xml");
	    SessionFactory factory = cg.buildSessionFactory();
	    
	    
	    // creating Question
		/*
		 * Question q1 = new Question(); q1.setQuestionId(1212);
		 * q1.setQuestion("what is java ");
		 * 
		 * // creating Answer
		 * 
		 * Answer answer1 = new Answer(); answer1.setAnswerId(343);
		 * answer1.setAnswer("java is programming language"); answer1.setQuestion(q1);
		 * 
		 * Answer answer2 = new Answer(); answer2.setAnswerId(344);
		 * answer2.setAnswer("and a pure oop programming langauge");
		 * answer2.setQuestion(q1);
		 * 
		 * Answer answer3 = new Answer(); answer3.setAnswerId(37);
		 * answer3.setAnswer("and considered to secure and robust prog langauge");
		 * answer3.setQuestion(q1);
		 * 
		 * List<Answer> list = new ArrayList<Answer>(); list.add(answer1);
		 * list.add(answer2); list.add(answer3);
		 * 
		 * 
		 * q1.setAnswers(list);
		 * 
		 * 
		 * 
		 */
	    
	    
	
	    
	 
	    
	    
	    
	    Session s = factory.openSession();
	    Transaction tx = s.beginTransaction();
		/*
		 * s.save(q1); s.save(answer1); s.save(answer2); s.save(answer3);
		 * 
		 */
	   
	   
	    
	 // fetching
		/*
		 * Question newQ = (Question) s.get(Question.class, 1212);
		 * System.out.println(newQ.getQuestion()); for(Answer ans : newQ.getAnswers()) {
		 * System.out.println(ans.getAnswer()); }
		 */
		  
	    
	    Question q = (Question) s.get(Question.class, 1212);
	    System.out.println(q.getQuestionId());
	    System.out.println(q.getQuestion());
	    
	    // LAZY Loading
	    
	    System.out.println(q.getAnswers().size());
	    
	    
	    
	    		
	    tx.commit();
	    
	    s.close();
	    factory.close();
	    
		
	}

}





















