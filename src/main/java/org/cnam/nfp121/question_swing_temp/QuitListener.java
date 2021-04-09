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

    private JFrame frame;

    public void actionPerformed(ActionEvent e) {
        Component src = (Component) e.getSource();
        if (frame == null){
            frame = (JFrame) SwingUtilities.getRoot(src);
        }
        frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
    }

    public QuitListener(){

    }

    public  QuitListener(JFrame frame){
        this.frame = frame;
    }
}
