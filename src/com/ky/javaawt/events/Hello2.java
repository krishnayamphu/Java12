package com.ky.javaawt.events;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hello2 extends Frame{
    private Button btn;
    public Hello2(){
        initComponents();
    }
    public void initComponents(){
        btn=new Button("Click");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Event Demo");
            }
        });
        add(btn);
        setLayout(new FlowLayout());
        setSize(300,200);
        setTitle("Event Demo");
        setVisible(true);
    }

    public static void main(String[] args) {
        new Hello2();
    }
}
