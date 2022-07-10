package com.mt.gui.awtui;

import java.awt.*;

public class FormDemo extends Frame {
    private Label lbltext;
    private TextField txtname;
    private Button btnok;
    private TextArea ta;
    private Checkbox cbbasic,cbweb,cbmale,cbfemale;
    private CheckboxGroup cg;
    private Choice choice;
    public FormDemo(){
        lbltext=new Label("Label Demo");
        txtname=new TextField("Enter some text",20);
        btnok=new Button("Submit");
        ta=new TextArea(5,20);
        cbbasic=new Checkbox("Basic", true);
        cbweb=new Checkbox("Web");
        cg=new CheckboxGroup();

        cbmale=new Checkbox("Male",cg,false);
        cbfemale=new Checkbox("Female",cg,false);
        choice=new Choice();
        choice.addItem("Nepal");
        choice.addItem("China");
        choice.addItem("India");
        setVisible(true);
        setSize(300,300);
        setTitle("MyForm");
        setLocation(200,200);
        setLayout(new FlowLayout());

        add(lbltext);
        add(txtname);
        add(ta);
        add(cbbasic);
        add(cbweb);
        add(cbmale);
        add(cbfemale);
        add(choice);
        add(btnok);
    }

    public static void main(String[] args) {
        new FormDemo();
    }
}
