package com.ky.collections;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> list=new HashSet<>();
        list.add("Ram");
        list.add("Hari");
        list.add("Ram");

        for(String s: list){
            System.out.println(s);
        }
    }
}
