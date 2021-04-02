package org.cnam.nfp121.question_swing_temp;

import java.awt.GridBagLayout;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JPanel;

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
    this.setLayout(new GridBagLayout());
    this.controlAnswerPanel = new JPanel();
    this.answerComponents = new ArrayList<JComponent>();
    this.add(controlAnswerPanel);
  }

}
