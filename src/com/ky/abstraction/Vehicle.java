package com.ky.abstraction;

public interface Vehicle {
    default void test(){
        System.out.println("Testing vehicle");
    }
    void run();
}
