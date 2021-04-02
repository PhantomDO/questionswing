package org.cnam.nfp121.question_swing_temp;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonReponsePanel extends ReponsePanel {

  /**
   *
   */
  private static final long serialVersionUID = 2111034126848871799L;

  private JPanel buttonValidatePanel;
  public JPanel getButtonValidatePanel() {
    return buttonValidatePanel;
  }

  public ButtonReponsePanel(JButton validate) {
    super();

    this.buttonValidatePanel = new JPanel();
    this.buttonValidatePanel.add(validate);
    this.controlAnswerPanel.add(buttonValidatePanel);
  }

}
