package com.ky.javaawt;

import java.awt.*;

public class Form extends Frame {
    public Form(){
        initComponents();
    }

    private void initComponents() {
        add(new Label("Name:"));
        add(new TextField(20));
        add(new Checkbox("Checkbox 1",true));
        add(new Checkbox("Checkbox 2",false));
        CheckboxGroup ckb=new CheckboxGroup();
        add(new Checkbox("Radio1",ckb,false));
        add(new Checkbox("Radio2",ckb,false));
        add(new Checkbox("Radio3",ckb,false));
        Choice choice=new Choice();
        choice.addItem("Apple");
        choice.addItem("Mango");
        choice.addItem("Orange");
        add(choice);

        List list=new List(4,false);
        list.add("Ram");
        list.add("Hari");
        list.add("Sita");
        add(list);
        add(new TextArea(5,20));

        add(new Button("Button"));
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setSize(240,400);
        setTitle("My Form Example");
        setVisible(true);
    }

    public static void main(String[] args) {
        new Form();
    }
}
