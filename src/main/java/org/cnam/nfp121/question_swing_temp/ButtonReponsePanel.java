package org.cnam.nfp121.question_swing_temp;

import javax.swing.JButton;
import java.util.ArrayList;
import javax.swing.JPanel;

import javax.swing.JComponent;

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
