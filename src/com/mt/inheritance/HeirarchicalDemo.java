package com.mt.inheritance;
class Mobile{
    String brandname;
    String model;
    double price;
}
class Apple extends Mobile{}
class Samsung extends Mobile{}

public class HeirarchicalDemo {
    public static void main(String[] args) {
        Apple apple=new Apple();
        apple.brandname="Apple";
        apple.model="iPhone 13";
        apple.price=100000;

        Samsung samsung=new Samsung();
        samsung.brandname="Samsung";
        samsung.model="Galaxy s10";
        samsung.price=70000;

        System.out.println("Mobile: "+apple.brandname);
        System.out.println("Model: "+apple.model);
        System.out.println("Price: "+apple.price);

        System.out.println("Mobile: "+samsung.brandname);
        System.out.println("Model: "+samsung.model);
        System.out.println("Price: "+samsung.price);
    }
}
