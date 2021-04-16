package org.cnam.nfp121.question_swing_temp;

import org.cnam.nfp121.question_swing_temp.windows.QuestionWindow;

import javax.swing.*;

public class QuestionSwingLauncher {

	public static void main(String[] args) {
		QuestionWindow questionWindow = new QuestionWindow();
		questionWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		questionWindow.setSize(1280, 720);
		questionWindow.setVisible(true);
	}

}
