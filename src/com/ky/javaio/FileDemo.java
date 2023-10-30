package com.ky.javaio;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        File file=new File("books.txt");
        try {
            file.createNewFile();
            System.out.println("file created.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
