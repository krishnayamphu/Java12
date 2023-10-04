package com.ky.javaawt.events;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hello extends Frame implements ActionListener {
    private Button btn,btn1;
    public Hello(){
        initComponents();
    }
    public void initComponents(){
        btn=new Button("Click");
        btn.addActionListener(this);
        add(btn);
        btn1=new Button("Exit");
        btn1.addActionListener(this);
        add(btn1);
        setLayout(new FlowLayout());
        setSize(300,200);
        setTitle("Event Demo");
        setVisible(true);
    }

    public static void main(String[] args) {
        new Hello();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn){
            System.out.println("Welcome to Java AWT Event.");

        }
        if(e.getSource()==btn1){
            System.exit(0);
        }
    }
}
