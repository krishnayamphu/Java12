package com.mt.basic;

import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of x:");
        int x=sc.nextInt();
        System.out.println("Value of x: "+x);

        System.out.print("Enter your name:");
        String name=sc.next();
        System.out.println("Name: "+name);
    }
}
