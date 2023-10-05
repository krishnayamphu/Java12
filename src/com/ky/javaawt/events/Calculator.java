package com.ky.javaawt.events;

import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame{
    private TextField tf1,tf2,tf3;
    private Button btnp,btns,btnm,btnd,btnc;
    public Calculator(){
        initComponents();
    }
    public void initComponents(){
        add(new Label("N1:"));
        tf1=new TextField(20);
        add(tf1);
        add(new Label("N2:"));
        tf2=new TextField(20);
        add(tf2);
        add(new Label("Re:"));
        tf3=new TextField(20);
        add(tf3);
        btnp=new Button(" + ");
        add(btnp);
        btns=new Button(" - ");
        add(btns);
        btnm=new Button(" x ");
        add(btnm);
        btnd=new Button(" / ");
        add(btnd);
        btnc=new Button(" c ");
        add(btnc);

        btnc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clear();
            }
        });
        btnp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double n1=Double.parseDouble(tf1.getText());
                double n2=Double.parseDouble(tf2.getText());
                tf3.setText(String.valueOf(n1+n2));
            }
        });
        btns.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double n1=Double.parseDouble(tf1.getText());
                double n2=Double.parseDouble(tf2.getText());
                tf3.setText(String.valueOf(n1-n2));
            }
        });
        btnm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double n1=Double.parseDouble(tf1.getText());
                double n2=Double.parseDouble(tf2.getText());
                tf3.setText(String.valueOf(n1*n2));
            }
        });
        btnd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double n1=Double.parseDouble(tf1.getText());
                double n2=Double.parseDouble(tf2.getText());
                tf3.setText(String.valueOf(n1/n2));
            }
        });
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setLayout(new FlowLayout());
        setSize(260,200);
        setTitle("Calculator");
        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }

    public void clear(){
        tf1.setText("");
        tf2.setText("");
        tf3.setText("");
    }
}
