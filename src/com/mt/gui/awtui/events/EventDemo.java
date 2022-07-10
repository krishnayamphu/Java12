package com.mt.gui.awtui.events;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventDemo extends Frame implements ActionListener {
    private Button btnok;
    public EventDemo(){
        btnok=new Button("Click Me");
        setVisible(true);
        setSize(400,350);
        setTitle("Event Demo");
        setLayout(new FlowLayout());
        add(btnok);
        btnok.addActionListener(this);
    }

    public static void main(String[] args) {
        new EventDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource()==btnok){
        System.out.println("Hello World");
    }
    }
}
