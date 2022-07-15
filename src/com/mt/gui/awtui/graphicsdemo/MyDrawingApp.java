package com.mt.gui.awtui.graphicsdemo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyDrawingApp extends Frame{
    private Button btnbox;
    public MyDrawingApp(){
        btnbox=new Button("Rectangle");
        setVisible(true);
        setSize(400,300);
        setLayout(new FlowLayout());
        add(btnbox);
        btnbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Graphics g=getGraphics();
                g.setColor(Color.black);
                g.fillRect(100,100,100,80);
                System.out.println("painting");
            }
        });
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                dispose();
            }
        });
    }
    public static void main(String[] args) {
        new MyDrawingApp();
    }
}
