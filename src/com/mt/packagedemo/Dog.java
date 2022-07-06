package com.mt.packagedemo;
final class Animal{ // prevent class to extends
    String name;
}
public class Dog /*extends Animal*/{
    public static void main(String[] args) {
        Dog dog=new Dog();
        //dog.name="ABC Dog";
       //System.out.println(dog.name);
    }
}
