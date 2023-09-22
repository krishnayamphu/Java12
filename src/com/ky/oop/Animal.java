package com.ky.oop;

public class Animal {
    public Animal(){
        System.out.println("Animal object created");
    }
    public Animal(String name){
        this();
        System.out.println("Animal name: "+name);
    }

    public static void main(String[] args) {
        Animal animal=new Animal("Cat");
    }
}
