package com.ky.javaawt;

import java.awt.*;

public class FrameDemo {
    public static void main(String[] args) {
        Frame f=new Frame();
        f.add(new Button("Button"));
        f.setLayout(new FlowLayout(FlowLayout.LEFT));
        f.setSize(400,300);
        f.setTitle("Frame Demo");
        f.setResizable(false);
        f.setVisible(true);
    }
}
