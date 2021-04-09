package org.cnam.nfp121.question_swing_temp;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class QuestionWindow extends JFrame{

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  private JButton quit;
  private JMenuBar menuBar;
  private JMenu menu;
  private JMenuItem menuItem;


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

    quit = new JButton("QUIT");
    quit.addActionListener(new QuitListener());
    container.add(quit, BorderLayout.WEST);

    menuBar = new JMenuBar();
    menu = new JMenu("File");
    menu.setMnemonic(KeyEvent.VK_A);
    menu.getAccessibleContext().setAccessibleDescription("File menu app");
    menuBar.add(menu);

    menuItem = new JMenuItem("Quit");
    menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_ALT + KeyEvent.VK_F4, WindowEvent.WINDOW_CLOSING));
    menuItem.addActionListener(new QuitListener(this));
    menuItem.getAccessibleContext().setAccessibleDescription("Quit btn");
    menu.add(menuItem);

    this.setJMenuBar(menuBar);
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