package com.map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Question {
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(int questionId, String question, Answer answer) {
		super();
		QuestionId = questionId;
		this.question = question;
		this.answer = answer;
	}
	
	
	@Id
	@Column(name= "question_id")
	private int QuestionId;
	private String question;
	
	@OneToOne
	@JoinColumn(name="a_id")
	private Answer answer;
	
	
	
	public int getQuestionId() {
		return QuestionId;
	}

	public void setQuestionId(int questionId) {
		QuestionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	
	
	
	

}
