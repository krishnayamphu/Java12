package com.mt.gui.awtui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Calculator extends Frame {
    Label lbln1,lbln2,lblre;
    TextField txtn1,txtn2,txtre;
    Button btnp,btns,btnm,btnac;
    double n1,n2;
    char op;
    public Calculator(){
        lbln1=new Label("N1:");
        lbln2=new Label("N2:");
        lblre=new Label("RE:");

        txtn1=new TextField(20);
        txtn2=new TextField(20);
        txtre=new TextField(20);

        btnp=new Button(" + ");
        btns=new Button(" - ");
        btnm=new Button(" x ");
        btnac=new Button(" C ");

        setLayout(new FlowLayout());
        setSize(300,200);
        setVisible(true);

        add(lbln1);
        add(txtn1);

        add(lbln2);
        add(txtn2);

        add(lblre);
        add(txtre);

        add(btnp);
        add(btns);
        add(btnm);
        add(btnac);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        btnp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n1=Double.parseDouble(txtn1.getText());
                n2=Double.parseDouble(txtn2.getText());
                double sum=n1+n2; //10+10
                txtre.setText(String.valueOf(sum));
            }
        });

        btns.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n1=Double.parseDouble(txtn1.getText());
                n2=Double.parseDouble(txtn2.getText());
                double sub=n1-n2;
                txtre.setText(String.valueOf(sub));
            }
        });

        btnm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n1=Double.parseDouble(txtn1.getText());
                n2=Double.parseDouble(txtn2.getText());
                double mul=n1*n2;
                txtre.setText(String.valueOf(mul));
            }
        });

        btnac.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtn1.setText("");
                txtn2.setText("");
                txtre.setText("");
            }
        });
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
