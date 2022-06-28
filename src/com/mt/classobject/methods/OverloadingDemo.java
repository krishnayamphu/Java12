package com.mt.classobject.methods;
public class OverloadingDemo {
    public void test(){
        System.out.println("default test method");
    }
    public void test(String testname){
        System.out.println("testing "+testname);
    }
    public void test(double num){
        System.out.println("testing number "+num);
    }
    public static void main(String[] args) {
        OverloadingDemo ob=new OverloadingDemo();
        ob.test();
        ob.test(50);

    }
}
