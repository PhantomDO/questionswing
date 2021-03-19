package org.cnam.nfp121.question_swing_temp;

import java.util.List;

public class Question {

  private String question;
  private List<QuestionCategory> categories;

  public Question(String question, List<QuestionCategory> categories) {
    this.setQuestion(question);
    this.setCategories(categories);
  }

  public List<QuestionCategory> getCategories() {
    return categories;
  }

  private void setCategories(List<QuestionCategory> categories) {
    this.categories = categories;
  }

  public String getQuestion() {
    return question;
  }

  private void setQuestion(String question) {
    this.question = question;
  }

}
