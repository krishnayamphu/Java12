package com.mt.inheritance;
class Vehicle{
    public void test(){
        System.out.println("Testing vehicle");
    }
}
class Hundai extends Vehicle{
    @Override
    public  void test(){
        System.out.println("Testing Hundai Car");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Hundai hundai=new Hundai();
        hundai.test();
    }
}
