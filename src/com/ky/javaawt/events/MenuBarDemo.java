package com.ky.javaawt.events;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBarDemo extends Frame {
    private MenuBar mb;
    private Menu mFile;
    private Menu mEdit;
    private MenuItem miopen, miclose;

    public MenuBarDemo() {
        initComponents();
    }

    public void initComponents() {
        MenuBar mb = new MenuBar();
        mFile = new Menu("File");
        mEdit = new Menu("Edit");
        miopen = new MenuItem("Open");
        miclose = new MenuItem("Close");
        mb.add(mFile);
        mb.add(mEdit);
        mFile.add(miopen);
        mFile.add(miclose);
        miclose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit((0));
            }
        });
        mb.add(mEdit);
        setMenuBar(mb);
        setLayout(new FlowLayout());
        setSize(300, 200);
        setTitle("Event Demo");
        setVisible(true);
    }

    public static void main(String[] args) {
        new MenuBarDemo();
    }
}
