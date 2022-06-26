package com.mt.basic;

public class ArrayDemo {
    public static void main(String[] args) {
        int num[]=new int[5];
        num[0]=50;
        num[1]=60;
        num[2]=70;
        num[3]=80;
        num[4]=90;

        System.out.println(num[4]);
        System.out.println("===========");
        for(int i=0; i<num.length; i++){
            System.out.println(num[i]);
        }

    }
}
