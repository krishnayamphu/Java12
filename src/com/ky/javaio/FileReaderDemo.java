package com.ky.javaio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        try {
            FileReader reader=new FileReader("data.txt");
            int i;
            while ((i=reader.read())!=-1){
                System.out.print((char)i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
