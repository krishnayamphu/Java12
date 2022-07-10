package com.mt.gui.awtui;

import java.awt.*;

public class MyFrame extends Frame {
    private Button btn;

    public MyFrame() {
        btn = new Button("Button");

        add(btn);
        setSize(400, 300);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
