package org.cnam.nfp121.question_swing_temp.windows;

import org.cnam.nfp121.question_swing_temp.ExitAction;
import org.cnam.nfp121.question_swing_temp.datas.QuizData;
import org.cnam.nfp121.question_swing_temp.panels.QuizPanel;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.*;

import javax.swing.*;

public class QuestionWindow extends JFrame{

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  private JMenuBar menuBar;
  private JMenu menu;
  private JMenuItem menuItem;

  private QuizPanel quizPanel;

  public QuestionWindow(){
    Container container = this.getContentPane();
    container.setLayout(new BorderLayout());

    ExitAction exitAction = new ExitAction(this);
    exitAction.setEnabled(true);
    exitAction.setText("Quit action");

    quizPanel = new QuizPanel(new QuizData(null));
    container.add(quizPanel);

    menuBar = new JMenuBar();
    menu = new JMenu("File");
    menu.setMnemonic(KeyEvent.VK_A);
    menu.getAccessibleContext().setAccessibleDescription("File menu app");
    menuBar.add(menu);

    menuItem = new JMenuItem(exitAction);
    menuItem.setText("Quit");
    menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_ALT + KeyEvent.VK_F4, WindowEvent.WINDOW_CLOSING));
    menuItem.getAccessibleContext().setAccessibleDescription("Quit btn");
    menu.add(menuItem);

    this.setJMenuBar(menuBar);
  }
}