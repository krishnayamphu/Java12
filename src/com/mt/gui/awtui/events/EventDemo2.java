package com.mt.gui.awtui.events;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventDemo2 extends Frame{
    private Button btnok;
    public EventDemo2(){
        btnok=new Button("Click Me");
        btnok=new Button("Say, Hello");
        setVisible(true);
        setSize(400,350);
        setTitle("Event Demo");
        setLayout(new FlowLayout());
        add(btnok);
        btnok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello World.");
            }
        });
    }

    public static void main(String[] args) {
        new EventDemo2();
    }
}
