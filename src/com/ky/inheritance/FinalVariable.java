package com.ky.inheritance;

public class FinalVariable {
    final int maxSpeed=150;

    public static void main(String[] args) {
        FinalVariable ob=new FinalVariable();
        System.out.println(ob.maxSpeed);
//        ob.maxSpeed=200;
//        System.out.println(ob.maxSpeed);
    }
}
