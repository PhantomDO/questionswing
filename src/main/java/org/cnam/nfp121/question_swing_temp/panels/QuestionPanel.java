package org.cnam.nfp121.question_swing_temp.panels;

import org.cnam.nfp121.question_swing_temp.datas.Clue;
import org.cnam.nfp121.question_swing_temp.datas.ClueGeneric;

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

  private JPanel questionPanel;
  public JPanel getQuestionPanel() {
    return questionPanel;
  }

  private JPanel cluePanel;
  public JPanel getCluePanel() {
    return cluePanel;
  }

  private ArrayList<JComponent> clueComponents;
  public ArrayList<JComponent> getClueComponents() {
    return clueComponents;
  }

  private JComponent questionComponent;
  public JComponent getQuestionComponent() {
    return questionComponent;
  }

  public void addClue(Clue c){
    ClueGeneric<String> clue = (ClueGeneric<String>) c;
    JComponent component = new JTextArea(clue.getClue());
    this.clueComponents.add(component);
    this.cluePanel.add(component);
  }

  public void addClues(ArrayList<Clue> cList){
    for (Clue c : cList) {
      this.addClue(c);
    }
  }

  public void addQuestion(String question){
    this.questionComponent = new JTextArea(question);
    this.questionPanel.add(questionComponent);
  }

  public QuestionPanel() {
    this.setLayout(new BorderLayout());
    this.setBackground(Color.GRAY);
    this.add(Box.createVerticalGlue());

    this.questionPanel = new JPanel();
    this.cluePanel = new JPanel();

    this.questionComponent = null;
    this.clueComponents = new ArrayList<JComponent>();

    this.add(cluePanel, BorderLayout.CENTER);
    this.add(questionPanel, BorderLayout.SOUTH);
  }

}