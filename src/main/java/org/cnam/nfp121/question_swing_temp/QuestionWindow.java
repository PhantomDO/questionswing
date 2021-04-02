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
    container.setLayout(new BorderLayout());

    questionPanel = CreateQuestionPanel(container);
    container.add(questionPanel, BorderLayout.CENTER);

    reponsePanel = CreateButtonReponsePanel(container);
    container.add(reponsePanel, BorderLayout.SOUTH);

    /// Set layout params
    {
      reponsePanel.getControlAnswerPanel().setLayout(new GridBagLayout());
      GridBagConstraints gbc = new GridBagConstraints();
      gbc.fill = GridBagConstraints.HORIZONTAL;
      gbc.weightx = 2;
      gbc.weighty = 2;

      ArrayList<JComponent> list = reponsePanel.getAnswerComponents();
      for (int rows = 0; rows < list.size(); rows++) {
        gbc.gridx = (rows % 2);
        gbc.gridy = (rows / 2) + 1;
        reponsePanel.getControlAnswerPanel().add(list.get(rows), gbc);
      }
    }
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
      JButton btn = new JButton(answer.getAnswer());
      btn.setSize(100, 200);
			answerComponents.add(btn);
		}

    ButtonReponsePanel buttonReponsePanel = new ButtonReponsePanel(new JButton("Validate"));
    buttonReponsePanel.addAnswers(answerComponents);
		return buttonReponsePanel;
  }

}