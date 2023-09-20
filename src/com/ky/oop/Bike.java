package com.ky.oop;

public class Bike {
    public void run(){
        System.out.println("Bike is running smoothly");
    }
    public int maxSpeed(){
        return 150;
    }

    public void info(String name,int capacity){
        System.out.println("Bike name: "+name);
        System.out.println("Engine Capacity: "+capacity+"cc");
    }

    public double getPrice(double price,double p){
        return price-((price*p)/100);
    }

    public static void main(String[] args) {
        Bike bike=new Bike();
        bike.run();
        System.out.println("Maximum bike speed: "+bike.maxSpeed());
        bike.info("Bajaj Pulser 150",150);
        System.out.println("Price: "+bike.getPrice(600000,10));
    }
}
