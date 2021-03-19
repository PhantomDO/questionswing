package org.cnam.nfp121.question_swing_temp;

public class QuestionCategory {

  private String name;
  private Integer id;

  public QuestionCategory(String name, Integer id) {
    this.setName(name);
    this.setId(id);
  }

  public Integer getId() {
    return id;
  }

  private void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  private void setName(String name) {
    this.name = name;
  }


}
