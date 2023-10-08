package com.ky.javaawt.awtgraphics;

import java.awt.*;

public class MyGraphics extends Frame {
    public MyGraphics(){
        initComponents();
    }
    public void initComponents(){
        setSize(400,300);
        setTitle("Graphics Demo");
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.ORANGE);
        g.fillRect(20,40,100,100);
        g.setColor(Color.red);
        g.drawOval(140,40,100,100);
        g.setColor(new Color(231, 70, 70));
        g.fillArc(260,40,100,100,0,180);

        int x[]={50,100,150,140,60};
        int y[]={230,160,230,290,290};
        g.drawPolygon(x,y,5);
        g.setFont(new Font("Arial",Font.BOLD,28));
        g.drawString("Hello world",200,250);
        g.drawLine(200,255,350,255);
    }

    public static void main(String[] args) {
        new MyGraphics();
    }
}
