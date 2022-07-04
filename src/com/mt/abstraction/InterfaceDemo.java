package com.mt.abstraction;
interface Printable {
    public void print();
}
public class InterfaceDemo implements Printable {

    @Override
    public void print() {
        System.out.println("printing something");
    }

    public static void main(String[] args) {
        InterfaceDemo id = new InterfaceDemo();
        id.print();
    }
}
