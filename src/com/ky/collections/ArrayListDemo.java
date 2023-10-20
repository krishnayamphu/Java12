package com.ky.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");

        Iterator itr=fruits.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("----------------------");
        fruits.add("Banana");
        fruits.remove("Mango");
        fruits.add("Apple");
        for(String s:fruits){
            System.out.println(s);
        }

        ArrayList<Book> books=new ArrayList<>();
        books.add(new Book("Java",250));
        books.add(new Book("C Language",200));

        for(Book book:books){
            System.out.println("Book Name: "+book.getName());
            System.out.println("Book Price: "+book.getPrice());
        }
    }
}
