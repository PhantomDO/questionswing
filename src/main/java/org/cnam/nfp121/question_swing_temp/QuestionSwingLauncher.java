package org.cnam.nfp121.question_swing_temp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class QuestionSwingLauncher {

	public static void main(String[] args) {
		QuestionWindow questionWindow = new QuestionWindow();
		questionWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		questionWindow.setSize(1280, 720);
		questionWindow.setVisible(true);
	}

}
