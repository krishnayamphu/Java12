package com.mt.exceptions;

public class ThrowsDemo2 {
    public void calc(int n1, int n2) throws ArithmeticException {
        System.out.println("Result: " + (n1 / n2));
    }

    public static void main (String[] args) throws ArithmeticException {
        ThrowsDemo2 demo2=new ThrowsDemo2();
        demo2.calc(2,0);
    }
}
