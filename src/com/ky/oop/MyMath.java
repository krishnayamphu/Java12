package com.ky.oop;

public class MyMath {
    int x;

    public void setX(int x){
        this.x=x;
    }
    public void test(){
        System.out.println("testing something");
    }
    public void myTest(){
        this.test();
    }
    public static void main(String[] args) {
        MyMath math=new MyMath();
        math.setX(5);
        System.out.println(math.x);

        math.myTest();
    }
}
