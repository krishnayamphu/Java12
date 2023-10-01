package com.ky.exception;

public class MultiTryCatchBlock {
    public static void main(String[] args) {
        try {
            int num[]={10,20};
            System.out.println(20 / 10);
            System.out.println("statement 1");
            System.out.println("Number: "+num[0]);
        }
        catch (ArithmeticException e){
            System.err.println(e);
//            JOptionPane.showMessageDialog(null,e);
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.err.println(ex);
        }
    }
}
