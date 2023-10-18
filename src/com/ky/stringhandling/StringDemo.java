package com.ky.stringhandling;

public class StringDemo {
    public static void main(String[] args) {
        String s="Aptech";
        String s1="     Hello World     ";

        System.out.println(s.length());
        System.out.println(s.equals("aptech"));
        System.out.println(s.equalsIgnoreCase("aptech"));
        System.out.println(s.isEmpty());
        System.out.println(s.concat(" computer"));
        System.out.println(s.replace('h','k'));
        System.out.println(s.indexOf('p'));
        System.out.println(s.toUpperCase());
        System.out.println(s1.trim());

        int a=5;
        double d=10.5;

        System.out.println(String.valueOf(a));
        System.out.println(String.valueOf(d));
    }
}
