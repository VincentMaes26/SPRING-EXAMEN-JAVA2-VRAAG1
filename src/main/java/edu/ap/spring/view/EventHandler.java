package edu.ap.spring.view;

import java.awt.event.ActionEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ap.spring.jpa.AnswerRepository;
import edu.ap.spring.jpa.QuestionRepository;

@Service
public class EventHandler {
	private UI ui;
	private QuestionRepository questionRepo;
	private AnswerRepository answerRepo;
	
	@Autowired
	public void setQuestionRepo(QuestionRepository qRepo) {
		this.questionRepo = qRepo;
	}
	
	@Autowired
	public void setAnswerRepo(AnswerRepository aRepo) {
		this.answerRepo = aRepo;
	}
	
	@Autowired
	public void setUI(UI ui) {
		this.ui = ui;
	}
	
	public void whenButtonClicked(ActionEvent actionEvent) {
		
	}
		
		

}
