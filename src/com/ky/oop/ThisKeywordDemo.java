package com.ky.oop;

public class ThisKeywordDemo {
    public static void main(String[] args) {
        Shape shape=new Shape().getShape();
        shape.height=100;
        shape.width=150;
        System.out.println("Width and Height: "+shape.width+", "+shape.height);
    }
}
