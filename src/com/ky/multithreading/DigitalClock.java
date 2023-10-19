package com.ky.multithreading;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class DigitalClock extends JFrame implements Runnable {
    JLabel lbltoday;
    JTextField txtbox;
    public DigitalClock(){
initComponents();
    }

    private void initComponents() {
        lbltoday=new JLabel();
        txtbox=new JTextField(20);

        add(new JLabel("Today:"));
        add(lbltoday);
        add(txtbox);
        setLayout(new FlowLayout());
        setTitle("Digital Clock");
        pack();
        setVisible(true);
    }

    @Override
    public void run() {
        while(true){
            try {
                lbltoday.setText(getDate());
                txtbox.setText(getTime());
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }

    public static void main(String[] args) {
        new Thread(new DigitalClock()).start();
    }

    public String getDate(){
        LocalDate date=LocalDate.now();
        return date.toString();
    }
    public String getTime(){
        LocalTime time=LocalTime.now();
        int h=time.getHour();
        if(h>12)
            h=h-12;
        int m=time.getMinute();
        int s=time.getSecond();
        return String.valueOf(h)+":"+String.valueOf(m)+":"+String.valueOf(s);
    }
}
