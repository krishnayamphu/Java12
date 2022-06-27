package com.mt.classobject;

public class MethodDemo {
    public static void main(String[] args) {
        Book b=new Book();
        b.test();
        System.out.println("Book title:"+b.getBookTitle());

        b.bookInfo("Aptech",500);
        System.out.println("Publication: "+b.getPublication("ABC"));

    }
}
