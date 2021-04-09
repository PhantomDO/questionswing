package org.cnam.nfp121.question_swing_temp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;

/**
 *
 */
public class ExitAction extends AbstractAction {

    private JFrame frame;
    private Boolean enabled;
    private String text;

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    public void actionPerformed(ActionEvent e) {
        if (frame == null){
            Component src = (Component) e.getSource();
            frame = (JFrame) SwingUtilities.getRoot(src);
        }
        frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
    }

    public ExitAction(){

    }

    public  ExitAction(JFrame frame){
        this.frame = frame;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
