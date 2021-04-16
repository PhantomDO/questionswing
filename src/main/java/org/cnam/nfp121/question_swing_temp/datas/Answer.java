package org.cnam.nfp121.question_swing_temp.datas;

import java.util.ArrayList;

public class Answer {

  private String answer;
  public String getAnswer() {
    return answer;
  }

  private Boolean validAnswer;
  public Boolean getValidAnswer() {
    return validAnswer;
  }

  public Answer(String answer, Boolean validAnswer) {
    this.answer =(answer);
    this.validAnswer =(validAnswer);
  }
}
