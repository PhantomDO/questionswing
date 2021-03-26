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
  private ArrayList<JComponent> resources;

  public ArrayList<JComponent> getResource() {
    return resources;
  }

  private void setResources(ArrayList<JComponent> resource) {
    this.resources = resource;
  }

  public Question getQuestion() {
    return question;
  }

  private void setQuestion(Question question) {
    this.question = question;
  }

  public QuestionPanel(LayoutManager layout, Question question, JComponent resource) {
    super(layout);

    this.setQuestion(question);
    this.add(new JTextField(question.getQuestion()));

    resources = new ArrayList<JComponent>();
    resources.add(resource);
    this.setResources(resources);
    this.add(resource);
  }

  public QuestionPanel(LayoutManager layout, Question question, ArrayList<JComponent> resources) {
    super(layout);

    this.setQuestion(question);
    this.add(new JTextField(question.getQuestion()));

    this.setResources(resources);

    for (JComponent t : resources) {
      this.add(t);
    }
  }

}