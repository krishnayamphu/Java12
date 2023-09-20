package com.ky.oop;
class Math{
    void sum(int a, int b){
        System.out.println("Sum: "+(a+b));
    }
    void sum(int a, int b, int c){
        System.out.println("Total: "+(a+b+c));
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Math math=new Math();
        math.sum(10,20);
        math.sum(1,10,15);
    }
}
