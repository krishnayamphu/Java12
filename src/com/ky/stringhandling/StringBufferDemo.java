package com.ky.stringhandling;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Aptech");

        System.out.println(sb);
        sb.append("Computer");
        System.out.println(sb);
        sb.insert(14,"education");
        System.out.println(sb);

        StringBuffer sb1=new StringBuffer("Hello");
        System.out.println(sb1.reverse());
        System.out.println(sb1.delete(4,5));
        System.out.println(sb1.deleteCharAt(0));
        System.out.println(sb1.indexOf("e"));
    }
}
