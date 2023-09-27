package com.ky.inheritance;
//final class AA{
class AA{
    final public void test(){
        System.out.println("Testing something");
    }
}
public class FinalMethod extends AA{
//    @Override
//    public void test(){
//        System.out.println("Some test is going to print");
//    }

    public static void main(String[] args) {
        FinalMethod me=new FinalMethod();
        me.test();
    }
}
