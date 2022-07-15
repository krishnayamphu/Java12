package com.mt.gui.awtui.graphicsdemo;

import java.awt.*;

public class MyGraphics extends Frame {
    public MyGraphics(){
        setSize(400,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new MyGraphics();
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(20,20,100,100);

        g.setColor(Color.green);
        g.fillOval(150,100,100,100);

    }
}
