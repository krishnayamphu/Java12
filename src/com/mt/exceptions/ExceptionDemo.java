package com.mt.exceptions;

import javax.swing.*;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
            System.out.println("Hello");
        }catch (ArithmeticException e){
            System.err.println("You can't / number by zero.\n"+e);
            JOptionPane.showMessageDialog(null,"You can't / by zero","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
}
