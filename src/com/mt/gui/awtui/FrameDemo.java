package com.mt.gui.awtui;

import java.awt.*;

public class FrameDemo {
    public static void main(String[] args) {
        Frame f=new Frame();
        Button btn=new Button("Button");
        f.setVisible(true);
        f.setSize(600,400);
        f.setTitle("Frame Demo");
        f.setLayout(new FlowLayout());
        f.add(btn);
    }
}
