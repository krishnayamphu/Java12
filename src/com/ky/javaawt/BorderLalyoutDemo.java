package com.ky.javaawt;

import java.awt.*;

public class BorderLalyoutDemo extends Frame {
    public BorderLalyoutDemo(){
        initComponents();
    }
    public void initComponents(){
        setLayout(new BorderLayout());
        add(new Button("North"),BorderLayout.NORTH);
        add(new Button("South"),BorderLayout.SOUTH);
        add(new Button("East"),BorderLayout.EAST);
        add(new Button("West"),BorderLayout.WEST);
        add(new Button("Center"),BorderLayout.CENTER);

        setSize(400,300);
        setTitle("BorderLayout");
        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLalyoutDemo();
    }
}
