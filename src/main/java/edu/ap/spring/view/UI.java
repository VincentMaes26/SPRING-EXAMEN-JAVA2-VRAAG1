package edu.ap.spring.view;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.TransferHandler;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UI implements InitializingBean {
	
	
	@Autowired
	EventHandler eventHandler;
	
	private JFrame jFrame;
	private JLabel label1, outputLabel;
	private JTextField question;
	private JPanel controlPanel;
	private JButton btnAnswerQuestion;
	
	public UI() {}
	
	public void setUp() {
		jFrame = new JFrame("EightBall");
		jFrame.setLayout(new FlowLayout());
		controlPanel = new JPanel();
		controlPanel.setLayout(new GridLayout(3,2));
		
		label1 = new JLabel("Question");
		outputLabel = new JLabel("");
		question = new JTextField(30);
		
		btnAnswerQuestion = new JButton();
		btnAnswerQuestion.setText("Answer question");
		btnAnswerQuestion.setTransferHandler(new TransferHandler("text"));
		btnAnswerQuestion.addActionListener(eventHandler::whenButtonClicked);
		
		controlPanel.add(label1);
		controlPanel.add(outputLabel);
		controlPanel.add(question);
		controlPanel.add(btnAnswerQuestion);
		
		jFrame.add(controlPanel);
		jFrame.setSize(600, 400);
		jFrame.setLocationRelativeTo(null);
    	jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.pack();
		jFrame.setVisible(true);	
	}
	
	public JFrame getjFrame() {
        return this.jFrame;
    }
	
	public JTextField getQuestion() {
		return this.question;
	}
	
	public JLabel getAnswer() {
		return this.outputLabel;
	}
	
	public String setAnswer(String answer) {
		this.outputLabel.setText(answer);
		return answer;
	}
	
	public JButton getButton() {
		return this.btnAnswerQuestion;
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.setProperty("java.awt.headless", "false");
	}
}
