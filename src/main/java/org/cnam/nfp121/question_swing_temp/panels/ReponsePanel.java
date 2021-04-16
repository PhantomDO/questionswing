package org.cnam.nfp121.question_swing_temp.panels;

import org.cnam.nfp121.question_swing_temp.datas.Answer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.*;

public class ReponsePanel extends JPanel {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  private GridBagConstraints gbc;
  public GridBagConstraints getGbc() {
    return gbc;
  }

  protected JPanel answerPanel;
  public JPanel getAnswerPanel() {
    return answerPanel;
  }

  private String rightAnswer;
  public String getRightAnswer() {
    return rightAnswer;
  }

  private String selectedAnswer;
  public String getSelectedAnswer() {
    return selectedAnswer;
  }

  public Boolean isSelectedRight() {
    return selectedAnswer.equals(rightAnswer);
  }

  protected ArrayList<JComponent> answerComponents;
  public ArrayList<JComponent> getAnswerComponents(){
    return answerComponents;
  }

  public void addAnswer(Answer answer){
    if (answer.getValidAnswer()) {
      rightAnswer = answer.getAnswer();
    }

    JButton btn = new JButton(new AbstractAction() {
      public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        selectedAnswer = btn.getText();
      }
    });
    btn.setText(answer.getAnswer());
    btn.setSize(100, 200);

    this.answerComponents.add(btn);
    this.answerPanel.add(btn, gbc);
  }

  public void addAnswers(ArrayList<Answer> answers){
    for (int rows = 0; rows < answers.size(); rows++) {
      Answer answer = answers.get(rows);
      gbc.gridx = (rows % 2);
      gbc.gridy = (rows / 2) + 1;
      this.addAnswer(answer);
    }
  }

  public ReponsePanel() {
    this.setLayout(new BorderLayout());

    gbc = new GridBagConstraints();
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.weightx = 2;
    gbc.weighty = 2;

    this.add(Box.createGlue(), BorderLayout.NORTH);
    this.add(Box.createGlue(), BorderLayout.EAST);
    this.add(Box.createGlue(), BorderLayout.WEST);

    this.answerPanel = new JPanel();
    this.answerPanel.setLayout(new GridBagLayout());
    this.answerPanel.setBackground(Color.YELLOW);
    this.answerComponents = new ArrayList<JComponent>();

    this.add(answerPanel, BorderLayout.CENTER);
  }
}
