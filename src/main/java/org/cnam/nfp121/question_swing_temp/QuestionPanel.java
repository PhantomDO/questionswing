package org.cnam.nfp121.question_swing_temp;

import java.awt.LayoutManager;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class QuestionPanel extends JPanel {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  private Question question;

  public Question getQuestion() {
    return question;
  }

  private void setQuestion(Question question) {
    this.question = question;
  }

  private ArrayList<JComponent> resourceComponents;

  public ArrayList<JComponent> getResourceComponents() {
    return resourceComponents;
  }

  private void setResourceComponents(ArrayList<JComponent> resourceComponents) {
    this.resourceComponents = resourceComponents;
    for (JComponent c : this.resourceComponents) {
      this.add(c);
    }
  }

  private void setResourceComponents(JComponent resourceComponent) {
    this.resourceComponents = new ArrayList<JComponent>();
    this.addComponent(resourceComponent);
  }

  public void addComponent(JComponent c){
    this.resourceComponents.add(c);
    this.add(c);
  }

  public void addComponents(ArrayList<JComponent> cList){
    for (JComponent c : cList) {
      this.addComponent(c);
    }
  }

  public QuestionPanel(LayoutManager layout, Question question, JComponent resource) {
    super(layout);

    this.setQuestion(question);
    this.add(new JTextField(question.getQuestion()));
    this.setResourceComponents(resource);
  }

  public QuestionPanel(LayoutManager layout, Question question, ArrayList<JComponent> resources) {
    super(layout);
    this.setQuestion(question);
    this.add(new JTextField(question.getQuestion()));
    this.setResourceComponents(resources);
  }

}