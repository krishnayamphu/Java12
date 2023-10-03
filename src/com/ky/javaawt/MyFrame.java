package com.ky.javaawt;

import java.awt.*;

public class MyFrame extends Frame {
    public MyFrame(){
        initComponents();
    }
    public void initComponents(){
        add(new Button("Button"));
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setSize(400,300);
        setTitle("Frame Demo");
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
