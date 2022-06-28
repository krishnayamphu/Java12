package com.mt.classobject;

public class ThisDemo {
    int n;
    public void getSquareNum(int n){
        this.n=n;
//        System.out.println(n*n);
    }

    public static void main(String[] args) {
        ThisDemo thisDemo=new ThisDemo();
        thisDemo.getSquareNum(5);

        System.out.println(thisDemo.n* thisDemo.n);
    }
}
