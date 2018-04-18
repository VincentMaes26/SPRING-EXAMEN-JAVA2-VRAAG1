package edu.ap.spring.view;

import java.awt.event.ActionEvent;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ap.spring.jpa.Answer;
import edu.ap.spring.jpa.Question;
import edu.ap.spring.jpa.QuestionRepository;

@Service
public class EventHandler {
	private UI ui;
	private QuestionRepository questionRepo;
	private Iterable<Answer> answerRepo;
	
	@Autowired
	public void setQuestionRepo(QuestionRepository qRepo) {
		this.questionRepo = qRepo;
	}
	
	@Autowired
	public void setAnswerRepo(List<Answer> aRepo) {
		aRepo.add(new Answer("Yes definitely"));
		aRepo.add(new Answer("I think so"));
		aRepo.add(new Answer("Ask again later"));
		aRepo.add(new Answer("I'm not sure"));
		aRepo.add(new Answer("I'd have to say no"));
		aRepo.add(new Answer("Most certainly not"));
		this.answerRepo = aRepo;
	}
	
	@Autowired
	public void setUI(UI ui) {
		this.ui = ui;
	}
	
	public void whenButtonClicked(ActionEvent actionEvent) {
		String questionText = ui.getQuestion().getText();
		Question q1 = new Question(questionText, new Answer(""));
		
		for(Answer a : answerRepo) {
			if(a.getId() == q1.getId()) {
				q1.setAnswer(a);
				String answer = a.getAnswerText();
				ui.setAnswer(answer);
			}
		}
		questionRepo.save(q1);
	}
		
		

}
