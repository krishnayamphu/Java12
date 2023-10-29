package com.ky.collections;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> queue=new PriorityQueue<>();
        queue.add("Apple");
        queue.add("Mango");
        queue.add("Orange");

        for (String item:queue) {
            System.out.println(item);
        }
        System.out.println("==============");
        queue.poll();
        for (String item:queue) {
            System.out.println(item);
        }
    }
}
