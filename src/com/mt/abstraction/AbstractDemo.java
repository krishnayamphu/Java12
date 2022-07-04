package com.mt.abstraction;
abstract class Mobile{
    public void test() { //non-abstract method
        System.out.println("testing mobile device");
    }
    public abstract void deviceInfo(); //abstract method
}
class Nokia extends Mobile{
    @Override
    public void deviceInfo() {
        System.out.println("Nokia n1600");
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        Nokia nokia=new Nokia();
        nokia.test();
        nokia.deviceInfo();
    }
}