package edu.ap.spring.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Answer {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String answerText;
	
	@OneToOne
	private Question question;

	public Answer() {
	
	}

	public Answer(String answerText, Question question) {
		super();
		this.answerText = answerText;
		this.question = question;
	}
	
	

}
