package com.ky.inheritance;
class Bike{
    public void run(String bike){
        System.out.println(bike+" is running");
    }
}
class Honda extends Bike{}
class Yamaha extends Bike{}

public class Hierarchical {
    public static void main(String[] args) {
        Honda honda1000r=new Honda();
        Yamaha r1=new Yamaha();

        honda1000r.run("Honda 1000R");
        r1.run("Yamaha R1");
    }
}
