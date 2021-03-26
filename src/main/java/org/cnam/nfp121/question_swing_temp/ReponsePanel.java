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

  public void addToFrame(JFrame container){
    for (JComponent t : answerComponents) {
      container.add(t);
    }
  }

  public void addRange(ArrayList<JComponent> c){
		this.answerComponents.addAll(c);
  }

  public ReponsePanel(LayoutManager layout, ArrayList<JComponent> answerComponents) {
    super(layout);
    this.answerComponents = answerComponents;
    for (JComponent t : answerComponents) {
      this.add(t);
    }
  }

}
