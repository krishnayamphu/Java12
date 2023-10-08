package com.ky.javaawt;

import java.awt.*;

public class MyPanel extends Frame {
    private Panel p1,p2;
    public MyPanel(){
        initComponents();
    }
    public void initComponents(){
        p1=new Panel();
        p1.setBackground(Color.CYAN);
        p1.add(new TextField(20));
        p1.add(new Button("Button"));

        p2=new Panel();
        p2.setBackground(Color.ORANGE);
        p2.add(new TextArea(5,27));

        add(p1);
        add(p2);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setSize(400,300);
        setTitle("Panel Demo");
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyPanel();
    }
}
