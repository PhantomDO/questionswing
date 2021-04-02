package org.cnam.nfp121.question_swing_temp;

import javax.swing.JFrame;

public class QuestionSwingLauncher {

	public static void main(String[] args) {
		QuestionWindow questionWindow = new QuestionWindow();
		questionWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		questionWindow.setSize(1280, 720);
		questionWindow.setVisible(true);
	}

}
