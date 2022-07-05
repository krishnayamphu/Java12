package com.mt.abstraction;

import org.w3c.dom.Text;

interface Writeable{
    void write();
}
public class TextEditor implements Printable,Writeable {
    public static void main(String[] args) {
        TextEditor te=new TextEditor();
        te.write();
        te.print();
    }

    @Override
    public void print() {
        System.out.println("Printing some text data");
    }

    @Override
    public void write() {
        System.out.println("Writing some text data");
    }
}
