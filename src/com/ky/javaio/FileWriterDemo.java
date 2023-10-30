package com.ky.javaio;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        try {
            FileWriter writer=new FileWriter("data.txt");
            writer.write("Hello world");
            writer.flush();
            writer.close();
            System.out.println("Data written successfully.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
