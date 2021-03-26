package org.cnam.nfp121.question_swing_temp;

import java.util.ArrayList;

public class Question {

  private String question;
  private Integer id;
  private ArrayList<QuestionCategory> categories;

  public Question(Integer id, String question, ArrayList<QuestionCategory> categories) {
    this.setId(id);
    this.setQuestion(question);
    this.setCategories(categories);
  }

  public Integer getId() {
    return id;
  }

  private void setId(Integer id) {
    this.id = id;
  }

  public ArrayList<QuestionCategory> getCategories() {
    return categories;
  }

  private void setCategories(ArrayList<QuestionCategory> categories) {
    this.categories = categories;
  }

  public String getQuestion() {
    return question;
  }

  private void setQuestion(String question) {
    this.question = question;
  }

}
