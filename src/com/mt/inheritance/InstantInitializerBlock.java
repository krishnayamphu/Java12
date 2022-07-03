package com.mt.inheritance;

public class InstantInitializerBlock {
    String test;
    {test="Testing...";}

    public static void main(String[] args) {
        InstantInitializerBlock ob=new InstantInitializerBlock();
        System.out.println(ob.test);
    }
}
