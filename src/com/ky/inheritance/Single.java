package com.ky.inheritance;
class Parent{
    int x;
}
public class Single extends Parent {
    public static void main(String[] args) {
        Single obj=new Single();
        obj.x=10;

        System.out.println(obj.x);
    }
}
