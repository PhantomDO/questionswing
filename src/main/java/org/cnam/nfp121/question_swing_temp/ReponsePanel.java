package org.cnam.nfp121.question_swing_temp;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.Box;
import java.awt.Color;

public class ReponsePanel extends JPanel {

  /**
   *
   */
  private static final long serialVersionUID = 1L;



  protected JPanel controlAnswerPanel;
  public JPanel getControlAnswerPanel() {
    return controlAnswerPanel;
  }

  protected ArrayList<JComponent> answerComponents;
  public ArrayList<JComponent> getAnswerComponents(){
    return answerComponents;
  }

  public void addAnswer(JComponent c){
    this.answerComponents.add(c);
    this.controlAnswerPanel.add(c);
  }

  public void addAnswers(ArrayList<JComponent> cList){
    for (JComponent c : cList) {
      this.addAnswer(c);
    }
  }

  public ReponsePanel() {
    this.setLayout(new BorderLayout());
    this.add(Box.createGlue(), BorderLayout.NORTH);
    this.add(Box.createGlue(), BorderLayout.EAST);
    this.add(Box.createGlue(), BorderLayout.WEST);


    this.controlAnswerPanel = new JPanel();
    this.controlAnswerPanel.setBackground(Color.YELLOW);
    this.answerComponents = new ArrayList<JComponent>();

    this.add(controlAnswerPanel, BorderLayout.CENTER);

  }

}
