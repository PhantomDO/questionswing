package org.cnam.nfp121.question_swing_temp;

import java.awt.LayoutManager;
import java.awt.event.ActionEvent;

import javax.accessibility.Accessible;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class QuestionPanel<T extends JComponent> extends JPanel implements Action, Accessible {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  private Question question;
  private T resource;

  public T getResource() {
    return resource;
  }

  private void setResource(T resource) {
    this.resource = resource;
  }

  public Question getQuestion() {
    return question;
  }

  private void setQuestion(Question question) {
    this.question = question;
  }

  public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub

  }

  public Object getValue(String key) {
    // TODO Auto-generated method stub
    return null;
  }

  public void putValue(String key, Object value) {
    // TODO Auto-generated method stub

  }

  public QuestionPanel(LayoutManager layout, Question question, T resource) {
    super(layout);

    this.setQuestion(question);
    this.add(new JTextField(question.getQuestion()));
    this.setResource(resource);
    this.add(resource);
  }

}