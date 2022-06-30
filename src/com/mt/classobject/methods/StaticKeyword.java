package com.mt.classobject.methods;

public class StaticKeyword {
    int x; //none-static member
    static int y; //static member

    public static void test(){
        y=5;
        System.out.println(y);
    }

    public static void main(String[] args) {
        StaticKeyword ob=new StaticKeyword();
        ob.x=10;
       y=15;

        System.out.println(ob.x);
        System.out.println(y);

        System.out.println("================");
        test();


    }
}
