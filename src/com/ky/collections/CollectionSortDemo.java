package com.ky.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSortDemo {
    public static void main(String[] args) {
        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple");
        for(String s: fruits){
            System.out.println(s);
        }
        System.out.println("Ascending Order:");
        Collections.sort(fruits);
        for(String s: fruits){
            System.out.println(s);
        }

        System.out.println("Descending Order:");
        Collections.reverse(fruits);
        for(String s: fruits) {
            System.out.println(s);
        }
    }
}
