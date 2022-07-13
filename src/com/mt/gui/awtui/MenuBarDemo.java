package com.mt.gui.awtui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBarDemo extends Frame {
    private MenuBar mb;
    private Menu mfile,medit,mhelp;
    private MenuItem miopen,misave,miabout;
    public MenuBarDemo(){

        mb=new MenuBar();
        mfile=new Menu("File");
        miopen=new MenuItem("Open");
        misave=new MenuItem("Save");
        mfile.add(miopen);
        mfile.add(misave);

        medit=new Menu("Edit");
        mhelp=new Menu("Help");
        miabout=new MenuItem("About");
        mhelp.add(miabout);

        mb.add(mfile);
        mb.add(medit);
        mb.add(mhelp);


        setMenuBar(mb);
        setLayout(new FlowLayout());
        setSize(300,200);
        setVisible(true);

        misave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Saving document.");
            }
        });
    }

    public static void main(String[] args) {
        new MenuBarDemo();
    }
}
