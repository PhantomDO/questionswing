package org.cnam.nfp121.question_swing_temp;

import java.util.ArrayList;

import java.awt.GridBagLayout;
import java.awt.CardLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class QuestionWindow extends JFrame{

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  private JPanel reponsePanel;
  public JPanel getReponsePanel() {
    return reponsePanel;
  }

  private JPanel questionPanel;
  public JPanel getQuestionPanel() {
    return questionPanel;
  }

  public QuestionWindow(){
    Container container = this.getContentPane();
    container.setLayout(new GridBagLayout());

    questionPanel = CreateQuestionPanel(container);
    reponsePanel = CreateReponsePanel(container);

    container.add(questionPanel);
    container.add(reponsePanel);
  }

  public JPanel CreateQuestionPanel(Container container){
    ArrayList<QuestionCategory> categories = new ArrayList<QuestionCategory>();
    categories.add(new QuestionCategory("Categorie0", 0));
    categories.add(new QuestionCategory("Categorie1", 1));

    Question question = new Question(0, "Question?", categories);
    JTextArea indice = new JTextArea("Ceci est un indice");
    return new QuestionPanel(question, indice);
  }

  public JPanel CreateReponsePanel(Container container){
		ArrayList<Answer> answers = Answer.getListFromRestAPI(null);

		ArrayList<JComponent> answerComponents = new ArrayList<JComponent>();
		for (Answer answer : answers) {
			answerComponents.add(new JButton(answer.getAnswer()));
		}

		return new ButtonReponsePanel(new JButton("Validate"), answerComponents);
  }

}