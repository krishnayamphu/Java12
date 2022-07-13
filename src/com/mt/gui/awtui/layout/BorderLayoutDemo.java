package com.mt.gui.awtui.layout;

import java.awt.*;

public class BorderLayoutDemo extends Frame {
    private Button btn1,btn2,btn3,btn4,btn5;
    public BorderLayoutDemo(){

        btn1=new Button("NORTH");
        btn2=new Button("SOUTH");
        btn3=new Button("EAST");
        btn4=new Button("WEST");
        btn5=new Button("CENTER");

        setVisible(true);
        setSize(400,400);
        add(btn1,BorderLayout.NORTH);
        add(btn2,BorderLayout.SOUTH);
        add(btn3,BorderLayout.EAST);
        add(btn4,BorderLayout.WEST);
        add(btn5,BorderLayout.CENTER);


    }
    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}
