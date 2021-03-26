package org.cnam.nfp121.question_swing_temp;

import java.awt.LayoutManager;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ReponsePanel extends JPanel {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  private ArrayList<JComponent> answerComponents;

  public ArrayList<JComponent> getAnswerComponents(){
    return answerComponents;
  }

  private void setAnswerComponents(ArrayList<JComponent> answerComponents) {
    this.answerComponents = answerComponents;
    for (JComponent c : this.answerComponents) {
      this.add(c);
    }
  }

  public void addComponent(JComponent c){
    this.answerComponents.add(c);
    this.add(c);
  }

  public void addComponents(ArrayList<JComponent> cList){
    for (JComponent c : cList) {
      this.addComponent(c);
    }
  }

  public ReponsePanel(LayoutManager layout, ArrayList<JComponent> answerComponents) {
    super(layout);
    this.setAnswerComponents(answerComponents);
  }

}
