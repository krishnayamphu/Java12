package com.ky.exception;

public class ThrowsDemo {
    public void calc() throws ArithmeticException{
        System.out.println("Result: "+(20/10));
    }

    public static void main(String[] args) {
        try {
            ThrowsDemo td = new ThrowsDemo();
            td.calc();
        }catch (ArithmeticException e) {
            System.err.println(e);
        }
    }
}
