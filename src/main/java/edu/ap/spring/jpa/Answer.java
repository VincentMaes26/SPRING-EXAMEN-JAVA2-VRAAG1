package edu.ap.spring.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Answer {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String answerText;


	public Answer(String answerText) {
		super();
		this.answerText = answerText;
	}

	public String getAnswerText() {
		return answerText;
	}

	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}


	public Long getId() {
		return id;
	}

	public boolean contains(String string) {
		if(this.answerText == string) {
			return true;
		}
		else{return false;}
	}

	
	

}
