package com.mt.classobject;

public class ThisDemo {
    int n;
    public void getSquareNum(int n){
        this.n=n;
//        System.out.println(n*n);
    }

    public int getMaxAge(){
        return 100;
    }

    public void showMaxAge(){
        int age=this.getMaxAge();
        System.out.println("Maximum age: "+age);
    }

    public static void main(String[] args) {
        ThisDemo thisDemo=new ThisDemo();
        thisDemo.getSquareNum(5);

        System.out.println(thisDemo.n* thisDemo.n);
        System.out.println("=======================");
        thisDemo.showMaxAge();
    }
}
