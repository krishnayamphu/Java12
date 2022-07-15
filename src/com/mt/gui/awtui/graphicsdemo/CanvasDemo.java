package com.mt.gui.awtui.graphicsdemo;

import java.awt.*;

public class CanvasDemo extends Canvas {
    public CanvasDemo(){
        setSize(400,300);
    }
    public static void main(String[] args) {

        Frame f=new Frame();
        f.add(new CanvasDemo());
        f.setSize(400,300);
        f.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        g.drawRect(10,20,100,50);
    }
}
