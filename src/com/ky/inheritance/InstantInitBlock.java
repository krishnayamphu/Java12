package com.ky.inheritance;

public class InstantInitBlock {
    int x;
    public InstantInitBlock(){
        System.out.println("Constructor is invoked");
        System.out.println("Value of x: "+x);
    }
    {
        x=10;
        System.out.println("Instant Initializer Block is invoked");
    }
    public static void main(String[] args) {
        new InstantInitBlock();
    }
}
