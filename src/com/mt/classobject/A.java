package com.mt.classobject;

public class A {
    private int a;
    public A getCurrentObject(){
        return this;
    }
    public void showCurrentObject(){
        A obj=getCurrentObject();
        obj.a=10;
        System.out.println(obj.a);
    }

    public static void main(String[] args) {
       new A().showCurrentObject();
    }
}
