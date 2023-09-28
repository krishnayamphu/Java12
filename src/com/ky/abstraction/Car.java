package com.ky.abstraction;

public class Car implements Vehicle{
    @Override
    public void run() {
        System.out.println("Running car safely");
    }
}
