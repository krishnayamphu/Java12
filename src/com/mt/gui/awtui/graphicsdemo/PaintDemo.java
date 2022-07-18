package com.mt.gui.awtui.graphicsdemo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class PaintDemo extends Frame implements MouseMotionListener {
    private Button btn;
    public PaintDemo(){
        btn=new Button("Clear");
        setVisible(true);
        setSize(400,300);
        setLayout(new FlowLayout());
        addMouseMotionListener(this);
        add(btn);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repaint();
            }
        });
    }
    public static void main(String[] args) {
        new PaintDemo();
    }

    @Override
    public void paint(Graphics g) {
        String s="Hello World";
        g.drawString(s,100,50);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
      Graphics  g=getGraphics();
      g.setColor(Color.red);
      g.fillOval(e.getX(),e.getY(),20,20);

    }
    @Override
    public void mouseMoved(MouseEvent e) {
//
    }
}
