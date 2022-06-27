package com.mt.classobject;

public class Book {
    public void test(){
        System.out.println("Default test method");
    }
    public String getBookTitle(){
        return "Java Programming";
    }
    public void bookInfo(String author, double price){
        System.out.println("Book Author: "+author);
        System.out.println("Book Price: "+price);
    }

    public String getPublication(String name){
        return name;
    }
}
