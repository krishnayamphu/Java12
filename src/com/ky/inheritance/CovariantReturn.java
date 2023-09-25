package com.ky.inheritance;

class A{
    public void hello(){
        System.out.println("Hello Java World");
    }
    public A get(){
        return this;
    }
}
public class CovariantReturn {
    public static void main(String[] args) {
        new A().get().hello();
    }
}
