package com.mt.classobject;

public class Bike {
    private int maxSpeed=200;
    public Bike(){
        System.out.println("Starting bike");
    }
    public Bike(String bikename){
        this();
        System.out.println(bikename+" is running smoothly");
    }

    public void getBike(Bike bike){
        System.out.println("Maximum speed limit is "+bike.maxSpeed);
    }
    public void showMaxSpeed(){
        getBike(this);
    }

    public static void main(String[] args) {
        new Bike("Honda");

        Bike yamahabike=new Bike();
        yamahabike.showMaxSpeed();

    }
}
