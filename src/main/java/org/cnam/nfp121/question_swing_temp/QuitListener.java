package org.cnam.nfp121.question_swing_temp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

/**
 *
 */
public class QuitListener implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        Component src = (Component) e.getSource();
        JFrame frame = (JFrame) SwingUtilities.getRoot(src);
        frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
    }
}
