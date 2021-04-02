package org.cnam.nfp121.question_swing_temp;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class QuestionWindow extends JFrame{

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  private ButtonReponsePanel reponsePanel;
  public ButtonReponsePanel getReponsePanel() {
    return reponsePanel;
  }

  private QuestionPanel questionPanel;
  public QuestionPanel getQuestionPanel() {
    return questionPanel;
  }

  public QuestionWindow(){
    Container container = this.getContentPane();
    container.setLayout(new GridBagLayout());

    questionPanel = CreateQuestionPanel(container);
    questionPanel.getControlQuestionPanel().setLayout(new GridBagLayout());
    questionPanel.getIndicePanel().setLayout(new GridBagLayout());

    reponsePanel = CreateButtonReponsePanel(container);
    /// Set layout params
    {
      reponsePanel.getControlAnswerPanel().setLayout(new GridBagLayout());
      GridBagConstraints gbc = new GridBagConstraints();
      gbc.fill = GridBagConstraints.HORIZONTAL;

      ArrayList<JComponent> list = reponsePanel.getAnswerComponents();
      for (int rows = 0; rows < list.size(); rows++) {
        gbc.gridx = (rows % 2);
        gbc.gridy = (rows / 2) + 1;
        reponsePanel.getControlAnswerPanel().add(list.get(rows), gbc);
      }

      reponsePanel.getButtonValidatePanel().setLayout(new GridBagLayout());
      gbc.gridy = list.size();
      gbc.gridx = 0;
      reponsePanel.getControlAnswerPanel().add(reponsePanel.getButtonValidatePanel(), gbc);
    }

    container.add(questionPanel);
    container.add(reponsePanel);
  }

  public QuestionPanel CreateQuestionPanel(Container container){
    ArrayList<QuestionCategory> categories = new ArrayList<QuestionCategory>();
    categories.add(new QuestionCategory("Categorie0", 0));
    categories.add(new QuestionCategory("Categorie1", 1));

    Question question = new Question(0, "Question?", categories);
    JTextArea indice = new JTextArea("Ceci est un indice");
    QuestionPanel questionPanel = new QuestionPanel(question);
    questionPanel.addIndice(indice);
    return questionPanel;
  }

  public ButtonReponsePanel CreateButtonReponsePanel(Container container){
		ArrayList<Answer> answers = Answer.getListFromRestAPI(null);

		ArrayList<JComponent> answerComponents = new ArrayList<JComponent>();
		for (Answer answer : answers) {
			answerComponents.add(new JButton(answer.getAnswer()));
		}

    ButtonReponsePanel buttonReponsePanel = new ButtonReponsePanel(new JButton("Validate"));
    buttonReponsePanel.addAnswers(answerComponents);
		return buttonReponsePanel;
  }

}