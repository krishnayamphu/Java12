package com.mt.gui.awtui.layout;

import java.awt.*;

public class NotePad extends Frame {
    private Button btn1,btn2,btn3,btn4,btn5;
    private MenuBar mb;
    private Menu mfile,medit,mhelp;
    private MenuItem miopen,misave,miabout;
    private Panel ptop,pcontent;
    private TextArea ta;
    public NotePad(){
        ptop=new Panel();
        ptop.setBackground(Color.cyan);
        pcontent=new Panel();
        ta=new TextArea();

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


        btn1=new Button("NORTH");
        btn2=new Button("SOUTH");
        btn3=new Button("EAST");
        btn4=new Button("WEST");
        btn5=new Button("CENTER");

        setVisible(true);
        setSize(400,400);
        setMenuBar(mb);

        ptop.add(btn1);
        ptop.add(btn2);
        add(ptop,BorderLayout.NORTH);

        add(pcontent,BorderLayout.CENTER);
        pcontent.setBackground(Color.PINK);
        pcontent.setLayout(new BorderLayout());
        pcontent.add(ta,BorderLayout.CENTER);




    }
    public static void main(String[] args) {
        new NotePad();
    }
}
