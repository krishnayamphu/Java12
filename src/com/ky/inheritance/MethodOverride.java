package com.ky.inheritance;
class Car{
    public void run(){
        System.out.println("Car is running");
    }
}
class Toyota extends Car{
    @Override
    public void run(){
        System.out.println("Toyota car is running smoothly");
    }
}
class BMW extends Car{
    @Override
    public void run(){
        System.out.println("BMW car is running safely");
    }
}
public class MethodOverride {
    public static void main(String[] args) {
        Toyota car=new Toyota();
        car.run();

        BMW bmw=new BMW();
        bmw.run();
    }
}
