package com.mt.exceptions;

public class FinallyBlock {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
            System.out.println("Hello World");
        }catch (ArithmeticException e){
            System.err.println(e);
        }finally {
            System.out.println("You reached finally block");
        }
    }
}
