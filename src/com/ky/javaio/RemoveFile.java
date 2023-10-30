package com.ky.javaio;

import java.io.File;

public class RemoveFile {
    public static void main(String[] args) {
        File f=new File("books.txt");
        if(f.delete()){
            System.out.println("file deleted");
        }else{
            System.out.println("file can't delete");
        }
    }
}
