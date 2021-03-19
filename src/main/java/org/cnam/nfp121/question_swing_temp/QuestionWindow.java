package org.cnam.nfp121.question_swing_temp;

import java.util.ArrayList;

import java.awt.GridBagLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class QuestionWindow extends JFrame{

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  public QuestionWindow(){
    Container container = this.getContentPane();
    container.setLayout(new GridBagLayout());

    container.add(CreateQuestionPanel(container));
    container.add(CreateReponsePanel(container));

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setSize(400, 500);
  }

  public JPanel CreateQuestionPanel(Container container){
    ArrayList<QuestionCategory> categories = new ArrayList<QuestionCategory>();
    categories.add(new QuestionCategory("Categorie0", 0));
    categories.add(new QuestionCategory("Categorie1", 1));

    Question question = new Question(0, "Question?", categories);
    JTextField resource = new JTextField("url");
    return new QuestionPanel<JTextField>(container.getLayout(), question, resource);
  }

  public JPanel CreateReponsePanel(Container container){
		ArrayList<Answer> answers = Answer.getListFromRestAPI(null);

		ArrayList<JButton> answerComponents = new ArrayList<JButton>();
		for (Answer answer : answers) {
			answerComponents.add(new JButton(answer.getAnswer()));
		}

		return new ButtonReponsePanel(container.getLayout(), answerComponents);
  }

}