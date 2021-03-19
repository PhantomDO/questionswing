package org.cnam.nfp121.question_swing_temp;

import java.util.ArrayList;

import java.awt.FlowLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class QuestionWindow extends JFrame{

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  public QuestionWindow(){
    Container container = this.getContentPane();
    container.setLayout(new FlowLayout());

    CreateQuestionPanel(container);
    CreateReponsePanel(container);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setSize(400, 500);
  }

  public void CreateQuestionPanel(Container container){

  }

  public void CreateReponsePanel(Container container){
		ArrayList<Answer> answers = Answer.getListFromRestAPI(null);

		ArrayList<JButton> answerComponents = new ArrayList<JButton>();
		for (Answer answer : answers) {
			answerComponents.add(new JButton(answer.getAnswer()));
		}

		ReponsePanel<JButton> rPanelReponse =
      new ReponsePanel<JButton>(container.getLayout(), answerComponents);
    container.add(rPanelReponse);
  }

}