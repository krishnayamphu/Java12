package com.ky.abstraction;

public class DefaultDemo {
    public static void main(String[] args) {
        Car car=new Car();
        Bike bike=new Bike();

        car.test();
        car.run();

        bike.test();
        bike.run();
    }
}
