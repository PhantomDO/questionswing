package org.cnam.nfp121.question_swing_temp;

import java.util.ArrayList;
import java.util.Collection;

public class Answer {

  private String answer;
  private Question question;
  private Boolean validAnswer;

  public Answer(String answer, Question question, Boolean validAnswer) {
    this.setAnswer(answer);
    this.setQuestion(question);
    this.setValidAnswer(validAnswer);
  }

  public Boolean getValidAnswer() {
    return validAnswer;
  }

  private void setValidAnswer(Boolean validAnswer) {
    this.validAnswer = validAnswer;
  }

  public Question getQuestion() {
    return question;
  }

  private void setQuestion(Question question) {
    this.question = question;
  }

  public String getAnswer() {
    return answer;
  }

  private void setAnswer(String answer) {
    this.answer = answer;
  }

  public static ArrayList<Answer> getListFromRestAPI(String url){
    ArrayList<Answer> answers = new ArrayList<Answer>();

    if (url == null){
      System.out.println("Test return list.");
      answers.add(new Answer("1", null, true));
      answers.add(new Answer("2", null, false));
      answers.add(new Answer("3", null, false));
      answers.add(new Answer("4", null, false));
      answers.add(new Answer("5", null, false));
      answers.add(new Answer("6", null, false));
    }

    return answers;
  }

}
