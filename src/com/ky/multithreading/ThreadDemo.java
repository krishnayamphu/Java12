package com.ky.multithreading;

public class ThreadDemo extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("running thread");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args) {
        new ThreadDemo().start();
    }
}
