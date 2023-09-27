package com.ky.abstraction;
abstract class Person{
    String name;
}
public class AbstractDemo extends Person{
    public static void main(String[] args) {
       AbstractDemo obj=new AbstractDemo();
       obj.name="Hari";
        System.out.println(obj.name);
    }
}
