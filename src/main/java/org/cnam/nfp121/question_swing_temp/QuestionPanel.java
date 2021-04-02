package org.cnam.nfp121.question_swing_temp;

import java.util.ArrayList;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.Box;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class QuestionPanel extends JPanel {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  private Question question;

  public Question getQuestion() {
    return question;
  }

  private JPanel controlQuestionPanel;

  public JPanel getControlQuestionPanel() {
    return controlQuestionPanel;
  }

  private JPanel indicePanel;

  public JPanel getIndicePanel() {
    return indicePanel;
  }

  private ArrayList<JComponent> indiceComponents;

  public ArrayList<JComponent> getResourceComponents() {
    return indiceComponents;
  }

  public void addIndice(JComponent c){
    this.indiceComponents.add(c);
    this.indicePanel.add(c);
  }

  public void addIndices(ArrayList<JComponent> cList){
    for (JComponent c : cList) {
      this.addIndice(c);
    }
  }

  public QuestionPanel(Question question) {
    this.setLayout(new BorderLayout());
    this.setBackground(Color.GRAY);
    this.add(Box.createVerticalGlue());

    this.question = question;
    this.controlQuestionPanel = new JPanel();
    this.controlQuestionPanel.add(new JTextArea(question.getQuestion()));

    this.indiceComponents = new ArrayList<JComponent>();
    this.indicePanel = new JPanel();

    this.add(indicePanel, BorderLayout.CENTER);
    this.add(controlQuestionPanel, BorderLayout.SOUTH);
  }

}