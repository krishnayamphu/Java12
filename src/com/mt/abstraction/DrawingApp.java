package com.mt.abstraction;
abstract class Shape{
    public Shape(String shapeName){
        System.out.println("drawing shape "+shapeName);
    }
}
class Circle extends Shape{
    public Circle(String circle){
        super(circle);
    }
}
public class DrawingApp {
    public static void main(String[] args) {
        Circle c=new Circle("Circle");

    }
}
