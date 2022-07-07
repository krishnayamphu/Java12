package com.mt.exceptions;

public class MultiCatch {
    public static void main(String[] args) {
        try {
        int[] num=new int[2];
        System.out.println(10/0);
        System.out.println("Hello World 1");
        System.out.println(num[5]);
        System.out.println("Hello World 2");
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.err.println(e);
        }
    }
}
