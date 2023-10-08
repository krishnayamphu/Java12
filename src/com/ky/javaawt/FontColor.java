package com.ky.javaawt;

import java.awt.*;

public class FontColor extends Frame {
    private Label lbl;
    private Button btn;
    public FontColor(){
        initComponents();
    }
    public void initComponents(){
        lbl=new Label("Hello World");
        lbl.setFont(new Font("Arial",Font.BOLD,30));
        lbl.setForeground(Color.BLUE);
        add(lbl);

        btn=new Button("Button");
        btn.setFont(new Font("Arial",Font.ITALIC,20));
        btn.setForeground(new Color(211, 16, 16));
        add(btn);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setSize(400,300);
        setTitle("Font and Color");
        setVisible(true);
    }

    public static void main(String[] args) {
        new FontColor();
    }
}
