package com.mt.gui.awtui.events;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowCloseDemo extends Frame {
    public WindowCloseDemo() {
        setVisible(true);
        setSize(400, 350);
        setTitle("Event Demo");
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new WindowCloseDemo();
    }
}
