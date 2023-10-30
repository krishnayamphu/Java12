package com.ky.javaio;

import java.io.File;

public class FileDemoFolder {
    public static void main(String[] args) {
        File f=new File("music");
        f.mkdir();
        System.out.println("folder created successfully");
    }
}
