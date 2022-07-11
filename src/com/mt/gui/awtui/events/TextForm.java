package com.mt.gui.awtui.events;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextForm extends Frame {
    private Label lbltext,lbltxt2;
    private TextField txtbox;
    private Button btnok;
    public TextForm(){
        lbltext=new Label("Text");
        lbltxt2=new Label("");
        txtbox=new TextField(20);
        btnok=new Button("Get Text");

        setVisible(true);
        setSize(260,240);
        setLayout(null);
        setResizable(false);
        setTitle("AWT Demo");

        add(lbltext);
        lbltext.setBounds(30,50,200,30);

        add(txtbox);
        txtbox.setBounds(30,90,200,30);

        add(btnok);
        btnok.setBounds(30,140,200,30);

        add(lbltxt2);
        lbltxt2.setBounds(30,180,200,30);

        btnok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data=txtbox.getText();
                lbltxt2.setText(data);
            }
        });
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new TextForm();
    }
}
