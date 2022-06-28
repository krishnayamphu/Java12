package com.mt.classobject;
public class Car {
    public Car(){
        System.out.println("default car constructor");
    }
    public Car(String name){
        System.out.println("smoothly running "+name+" car");
    }

    public static void main(String[] args) {
        Car car=new Car();
        new Car("Hundai");
        new Car("Suzuki");
    }
}
