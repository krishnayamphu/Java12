package com.ky.javaio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        try {
            BufferedWriter bw=new BufferedWriter(new FileWriter("test.txt"));
            bw.write("java io api");
            bw.flush();
            bw.close();
            System.out.println("data written successfully");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
