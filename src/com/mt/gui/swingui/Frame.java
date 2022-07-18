package com.mt.gui.swingui;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    public Frame() {
        setVisible(true);

        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new Label("Text"));
        add(new JTextField(20));
        add(new JButton("Button"));
        pack();
    }

    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                //Nimbus,Windows,Metal
                if ("Windows".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException | UnsupportedLookAndFeelException | InstantiationException ex) {
            System.err.println(ex);
        }
        new Frame();
    }
}
