package com.ky.javaawt.awtgraphics;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MyDrawing extends Frame {
    private Button btndraw,btnclear;
    public MyDrawing(){
        initComponents();
    }
    public void initComponents(){
        btndraw=new Button("Draw");
        btndraw.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                draw();
            }
        });
        add(btndraw);

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                mouseDraw(e);
            }
        });

        btnclear=new Button("clear");
        btnclear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repaint();
            }
        });

        add(btnclear);
        setLayout(new FlowLayout());
        setSize(400,300);
        setTitle("Graphics Demo");
        setVisible(true);
    }

    public void draw() {
        Graphics g=this.getGraphics();
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

    public void mouseDraw(MouseEvent e) {
        Graphics g=this.getGraphics();
        g.setColor(Color.ORANGE);
        g.fillOval(e.getX(),e.getY(),10,10);
    }



    public static void main(String[] args) {
        new MyDrawing();
    }
}
