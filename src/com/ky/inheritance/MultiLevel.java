package com.ky.inheritance;
class Animal{
    String color;
}
class Dog extends Animal{
    int age;
}
class Puppy extends Dog{
   String name;
}
public class MultiLevel {
    public static void main(String[] args) {
        Puppy puppy=new Puppy();
        puppy.name="Puppy";
        puppy.color="Brown";
        puppy.age=2;

        System.out.println(puppy.name);
        System.out.println(puppy.color);
        System.out.println(puppy.age);
    }
}
