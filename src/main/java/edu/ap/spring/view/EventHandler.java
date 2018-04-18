package edu.ap.spring.view;

import java.awt.event.ActionEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.ap.spring.jpa.Question;
import edu.ap.spring.jpa.QuestionRepository;
import edu.ap.spring.model.EightBall;

@Service
public class EventHandler {
	private UI ui;
	
	private QuestionRepository questionRepo;
	private EightBall eightBall;
	
	@Autowired
	public void setQuestionRepo(QuestionRepository qRepo) {
		this.questionRepo = qRepo;
	}
	
	@Autowired
	public void setEightBall(EightBall eightBall) {
		this.eightBall = eightBall;
	}
	
	@Autowired
	public void setUI(UI ui) {
		this.ui = ui;
	}
	
	public void whenButtonClicked(ActionEvent actionEvent) {
		String questionText = ui.getQuestion().getText();
		Question q1 = new Question(questionText, "");
		if(!questionRepo.exists(q1.getId()){
			String answer = ui.setAnswer(eightBall.getRandomAnswer(q1.getQuestion()));
			q1.setAnswer(answer);
			questionRepo.save(q1);
		};
		
	}
		
		

}
