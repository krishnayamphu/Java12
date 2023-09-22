package com.ky.oop;

public class Cat {
    String name;
    String color;
    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public void getInfo(Cat cat){
        System.out.println("Cat Name: "+cat.name);
        System.out.println("Cat Color:"+cat.color);
    }
    public void show(){
        getInfo(this);
    }
    public static void main(String[] args) {
        new Cat("Kitty","White").show();
    }
}
