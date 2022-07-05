package com.mt.abstraction;
interface Aa{
    default void demo(){
        System.out.println("default method from Aa");
    }
    static void test(){
        System.out.println("testing methods");
    }

}
public class Abc implements Aa{
    public static void main(String[] args) {
        Aa obj=new Abc();
        obj.demo();
        Aa.test();
    }
}
