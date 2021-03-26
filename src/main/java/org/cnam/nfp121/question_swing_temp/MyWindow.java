package org.cnam.nfp121.question_swing_temp;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyWindow extends JFrame {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -7969742465745872066L;

	public MyWindow() {
		JLabel lbl = new JLabel();
		lbl.setText("Bonjour");

		JButton btn = new JButton();
		btn.setText("Cliquez-moi");

		//JTable table = new JTable(3, 2);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setSize(400, 500);
		super.setLayout(new FlowLayout());
	}

}

