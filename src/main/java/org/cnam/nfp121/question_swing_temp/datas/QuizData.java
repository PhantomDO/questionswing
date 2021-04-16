package org.cnam.nfp121.question_swing_temp.datas;

import org.cnam.nfp121.question_swing_temp.datas.Answer;
import org.cnam.nfp121.question_swing_temp.datas.Clue;
import org.cnam.nfp121.question_swing_temp.datas.ClueGeneric;
import org.cnam.nfp121.question_swing_temp.datas.QuestionCategory;

import java.util.ArrayList;

public class QuizData {

  private String url;
  public String getUrl() {
    return url;
  }

  private String question;
  public String getQuestion() {
    return question;
  }
  private void setQuestionFromRestAPI(){
    if (url == null){
      question = "Question?";
    }
  }

  private ArrayList<QuestionCategory> categories;
  public ArrayList<QuestionCategory> getCategories() {
    return categories;
  }
  private void setCategoriesFromRestAPI(){
    if (url == null){
      System.out.println("Test return list.");
      categories.add(new QuestionCategory(1, "Cat 1"));
      categories.add(new QuestionCategory(2, "Cat 2"));
    }
  }

  private ArrayList<Answer> answers;
  public ArrayList<Answer> getAnswers() {
    return answers;
  }
  private void setAnswerFromRestAPI(){
    if (url == null){
      System.out.println("Test return list.");
      answers.add(new Answer("1", true));
      answers.add(new Answer("2", false));
      answers.add(new Answer("3", false));
      answers.add(new Answer("4", false));
      answers.add(new Answer("5", false));
      answers.add(new Answer("6", false));
    }
  }

  private ArrayList<Clue> clues;
  public ArrayList<Clue> getClues() {
    return clues;
  }
  private void setCluesFromRestAPI(){
    if (url == null){
      System.out.println("Test return list.");
      clues.add(new ClueGeneric<String>(1, "Ceci est un indice"));
    }
  }

  public QuizData(String url) {
    this.url = url;

    this.question = null;
    this.setQuestionFromRestAPI();

    this.categories = new ArrayList<QuestionCategory>();
    this.setCategoriesFromRestAPI();

    this.answers = new ArrayList<Answer>();
    this.setAnswerFromRestAPI();

    this.clues = new ArrayList<Clue>();
    this.setCluesFromRestAPI();
  }

}
