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
        int x[]={10,200,50,100,150};
        int y[]={100,100,200,20,200};

        g.setColor(Color.red);
        g.fillRect(20,20,100,100);

        g.setColor(Color.green);
        g.fillOval(150,100,100,100);

        g.fillArc(20,150,50,50,0,90);
        g.drawArc(70,150,50,50,0,90);
        g.setColor(Color.orange);
        g.drawPolygon(x,y,5);


    }
}
