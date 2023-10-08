package com.ky.javaawt;

import java.awt.*;

public class GridLayoutDemo extends Frame {
    public GridLayoutDemo(){
        initComponents();
    }
    public void initComponents(){
        setLayout(new GridLayout(2,3));
        add(new Button("1"));
        add(new Button("2"));
        add(new Button("3"));
        add(new Button("4"));
        add(new Button("5"));
        add(new Button("6"));

        setSize(400,300);
        setTitle("GridLayout");
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutDemo();
    }
}
