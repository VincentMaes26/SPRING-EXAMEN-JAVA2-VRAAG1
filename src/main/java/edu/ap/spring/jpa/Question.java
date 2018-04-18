package edu.ap.spring.jpa;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Question {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String question;
	
	private String answer;
	
	public Question() {}
	
	public Question(String questionText, String answer) {
		super();
		this.question = questionText;
		this.answer = answer;
	}
	
	public String getQuestion() {
		return this.question;
	}
	
	public String getAnswer() {
		return this.answer;
	}
	
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public Long getId() {
		return id;
	}
}
