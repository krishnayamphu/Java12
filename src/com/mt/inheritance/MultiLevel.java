package com.mt.inheritance;
class Animal{
    String color;
}
class Bird extends Animal{
    double weight;
}
class Crow extends Bird{
    String name;
    public static void main(String[] args) {
        Crow crow=new Crow();
        crow.name="Crow";
        crow.color="Black";
        crow.weight=50;

        System.out.println("Bird name: "+crow.name);
        System.out.println("Bird color: "+crow.color);
        System.out.println("Bird weight: "+crow.weight);

    }

}
public class MultiLevel {
}
