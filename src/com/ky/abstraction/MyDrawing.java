package com.ky.abstraction;
abstract class Shape{
    public Shape(){ System.out.println("Shape is created"); }
    abstract void draw();
    public void paint(String color) {System.out.println("Painting shape with "+color+" color");}
    public static void test(){
        System.out.println("Testing shape");
    }
    public final void shapeInfo(){
        System.out.println("showing shape info");
    }
}
class Circle extends Shape{
    @Override
    void draw() {System.out.println("Drawing circle shape"); }
//    void shapeInfo(){
//
//    }
}
class Rectangle extends Shape{
    @Override
    void draw() {System.out.println("Drawing rectangle shape"); }
}
public class MyDrawing {
    public static void main(String[] args) {
        Shape circle=new Circle();
        circle.draw();
        circle.paint("red");

        Shape rect=new Rectangle();
        rect.draw();
        rect.paint("green");

        //static method
        Shape.test();
    }
}
