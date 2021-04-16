package org.cnam.nfp121.question_swing_temp.panels;

import java.awt.BorderLayout;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;

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

    validate.addActionListener(new AbstractAction() {
      public void actionPerformed(ActionEvent e) {
        System.out.printf("Selected Answer : %b%n", isSelectedRight());
      }
    });

    this.buttonValidatePanel = new JPanel();
    this.buttonValidatePanel.setBackground(Color.YELLOW);
    this.buttonValidatePanel.add(validate);
    this.add(buttonValidatePanel, BorderLayout.SOUTH);
  }

}
