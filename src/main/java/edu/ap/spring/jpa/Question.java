package edu.ap.spring.jpa;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Question {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String questionText;
	
	@OneToOne(mappedBy = "question", cascade = CascadeType.ALL)
	private Answer answer;
	
	public Question() {}
	
	public Question(String questionText, Answer answer) {
		super();
		this.questionText = questionText;
		this.answer = answer;
	}
	
	
}
