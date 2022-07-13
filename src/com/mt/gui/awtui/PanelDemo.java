package com.mt.gui.awtui;

import java.awt.*;

public class PanelDemo extends Frame {
    public static void main(String[] args) {
        PanelDemo f=new PanelDemo();
        f.setVisible(true);
        f.setSize(400,300);

        Panel p=new Panel();
        p.setBackground(Color.cyan);

        Button btn=new Button("Hello");
        p.add(btn);
        f.add(p);
    }
}
