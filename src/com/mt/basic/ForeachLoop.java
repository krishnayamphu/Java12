package com.mt.basic;

public class ForeachLoop {
    public static void main(String[] args) {
        int num[]={10,20,30,40,50,60};
        for (int n:num) {
            System.out.println(n);
        }
        String[] name_list={"Ram","Hari","Sita"};
        for(String name:name_list){
            System.out.println("Name: "+name);
        }
    }
}
