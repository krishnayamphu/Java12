package com.ky.javaawt;

import java.awt.*;

public class NullLayoutDemo extends Frame {
    private Button btn1;
    private TextField tf1;
    public NullLayoutDemo(){
        initComponents();
    }
    public void initComponents(){
        setLayout(null);
        tf1=new TextField(20);
        tf1.setBounds(20,50,200,20);
        btn1=new Button("Button");
        btn1.setBounds(240,50,60,20);

        add(tf1);
        add(btn1);
        setSize(400,300);
        setTitle("Null Layout");
        setVisible(true);
    }

    public static void main(String[] args) {
        new NullLayoutDemo();
    }
}
