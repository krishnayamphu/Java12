package com.mt.exceptions;

public class ThrowsDemo {
    public void calc(int n1, int n2) throws ArithmeticException {
        System.out.println("Result: " + (n1 / n2));
    }
    public void test() {
        try {
            calc(2,0);
        } catch (ArithmeticException e) {
            System.err.println(e);
        }
    }
    public static void main(String[] args) {
        ThrowsDemo demo=new ThrowsDemo();
        demo.test();
    }
}
