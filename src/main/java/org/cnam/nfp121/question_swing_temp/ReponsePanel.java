package org.cnam.nfp121.question_swing_temp;

import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.Collection;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ReponsePanel<T extends JComponent> extends JPanel {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  private ArrayList<T> answerComponents;

  public ArrayList<T> getAnswerComponents(){
    return answerComponents;
  }

  public void addToFrame(JFrame container){
    for (T t : answerComponents) {
      container.add(t);
    }
  }

  public void addRange(Collection<? extends T> c){
		this.answerComponents.addAll(c);
  }

  public ReponsePanel(LayoutManager layout, ArrayList<T> answerComponents) {
    super(layout);
    this.answerComponents = answerComponents;
    for (T t : answerComponents) {
      this.add(t);
    }
  }

}
