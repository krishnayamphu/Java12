package com.ky.abstraction;

public class MyPrinter implements Printable,Writeable{
    @Override
    public void print() {
        System.out.println("Printing something");
    }

    public static void main(String[] args) {
        MyPrinter printer=new MyPrinter();
        printer.write();
        printer.print();
    }

    @Override
    public void write() {
        System.out.println("Writing something");
    }
}
