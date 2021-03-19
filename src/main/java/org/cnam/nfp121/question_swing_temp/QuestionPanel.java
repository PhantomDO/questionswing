package org.cnam.nfp121.question_swing_temp;

import java.awt.LayoutManager;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class QuestionPanel<T extends JComponent> extends JPanel {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  private Question question;
  private ArrayList<T> resources;

  public ArrayList<T> getResource() {
    return resources;
  }

  private void setResources(ArrayList<T> resource) {
    this.resources = resource;
  }

  public Question getQuestion() {
    return question;
  }

  private void setQuestion(Question question) {
    this.question = question;
  }

  public QuestionPanel(LayoutManager layout, Question question, T resource) {
    super(layout);

    this.setQuestion(question);
    this.add(new JTextField(question.getQuestion()));

    resources = new ArrayList<T>();
    resources.add(resource);
    this.setResources(resources);
    this.add(resource);
  }

  public QuestionPanel(LayoutManager layout, Question question, ArrayList<T> resources) {
    super(layout);

    this.setQuestion(question);
    this.add(new JTextField(question.getQuestion()));

    this.setResources(resources);

    for (T t : resources) {
      this.add(t);
    }
  }

}