package com.mt.gui.awtui;

import java.awt.*;

public class ColorDemo extends Frame {
    private Panel p1,p2,p3,p4,p5;
    private Label lblnorth,lblsouth,lblwest,lbleast;
    public ColorDemo(){
        p1=new Panel();
        p2=new Panel();
        p3=new Panel();
        p4=new Panel();
        p5=new Panel();

        Font f=new Font("Arial",Font.BOLD,20);
        lblnorth=new Label("NORTH");
        lblsouth=new Label("SOUTH");
        lblwest=new Label("WEST");
        lbleast=new Label("EAST");

        lblnorth.setFont(f);
        lblnorth.setForeground(Color.white);
//        lblnorth.setBackground(Color.cyan);
        lblsouth.setFont(f);
        lblwest.setFont(new Font("Arial",Font.ITALIC,20));
        lbleast.setFont(new Font("Arial",Font.BOLD,18));
        lbleast.setForeground(Color.white);

        p1.add(lblnorth);
        p4.add(lblsouth);
        p2.add(lblwest);
        p5.add(lbleast);

        setVisible(true);
        setSize(400,400);
        setLayout(new BorderLayout());

        p1.setBackground(Color.orange);
        add(p1,BorderLayout.NORTH);

        p2.setBackground(new Color(50,50,200));
        add(p2,BorderLayout.WEST);

        p3.setBackground(new Color(250,50,250,255));
        add(p3,BorderLayout.CENTER);

        p4.setBackground(new Color(25,200,20,255));
        add(p4,BorderLayout.SOUTH);

        p5.setBackground(new Color(25,20,60));
        add(p5,BorderLayout.EAST);
    }

    public static void main(String[] args) {
        new ColorDemo();
    }
}
