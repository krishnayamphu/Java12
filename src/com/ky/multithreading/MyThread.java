package com.ky.multithreading;

import java.time.LocalDateTime;

public class MyThread implements Runnable{
    @Override
    public void run() {
        while(true){
            try {
                System.out.println(LocalDateTime.now());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args) {
        Thread thread=new Thread(new MyThread());
        thread.start();
    }
}
