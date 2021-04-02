package org.cnam.nfp121.question_swing_temp;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;

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
    this.buttonValidatePanel.setBackground(Color.YELLOW);
    this.buttonValidatePanel.add(validate);
    this.add(buttonValidatePanel, BorderLayout.SOUTH);
  }

}
