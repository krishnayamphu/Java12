package com.ky.swing;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(){
        initComponents();
    }

    private void initComponents() {
        ButtonGroup gender=new ButtonGroup();
        JRadioButton rbMale=new JRadioButton("Male",false);
        JRadioButton rbFemale=new JRadioButton("Female",false);
        JComboBox country=new JComboBox();
        country.addItem("Nepal");
        country.addItem("Japan");
        gender.add(rbMale);
        gender.add(rbFemale);
        add(new JPasswordField(20));
        add(rbMale);
        add(rbFemale);
        add(new JButton("Button"));
        add(country);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
