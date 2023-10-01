package com.ky.exception;

import javax.swing.*;

public class TryCatchBlock {
    public static void main(String[] args) {
        try {
            System.out.println(20 / 0);
        }
        catch (ArithmeticException e){
            System.err.println(e);
//            JOptionPane.showMessageDialog(null,e);
        }
    }
}
