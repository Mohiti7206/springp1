package com.map;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.*;

public class MapDemo {
	public static void main(String[] args) {
		

		Configuration cg = new Configuration();
	    cg.configure("hibernate.cfg.xml");
	    SessionFactory factory = cg.buildSessionFactory();
	    
	    
	    // creating Question
	    
	    Question q1 = new Question();
	    q1.setQuestionId(1212);
	    q1.setQuestion("what is java ");
	    
	    // creating Answer
	    
	    Answer answer = new Answer();
	    answer.setAnswerId(343);
	    answer.setAnswer("java is programming language");
	    answer.setQuestion(q1);
	    q1.setAnswer(answer);
	    
	    
	    Question q2 = new Question();
	    q2.setQuestionId(242);
	    q2.setQuestion("what is collection framework ");
	    
	    Answer answer2 = new Answer();
	    answer2.setAnswerId(344);
	    answer2.setAnswer("Api to work with java");
	    answer2.setQuestion(q2);
	    
	    q2.setAnswer(answer2);
	    Session s = factory.openSession();
	    
	    Transaction tx = s.beginTransaction();
	    
	    s.save(q1);
	    s.save(q2);
	    s.save(answer);
	    s.save(answer2);
	    tx.commit();
	    
	 // fetching
	    
	    Question newQ = (Question) s.get(Question.class, 1212);
	    System.out.println(newQ.getQuestion());
	    System.out.println(newQ.getAnswer().getAnswer());
	    
	    
	    
	    s.close();
	    factory.close();
	    
		
	}

}





















