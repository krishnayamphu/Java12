package com.mt.inheritance;
class A{
    public int a;
}
public class B extends A{
    public static void main(String[] args) {
        B ob=new B();
        ob.a=5;
        System.out.println(ob.a);

    }
}
