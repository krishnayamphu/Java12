package com.ky.javaio;

import java.io.File;

public class ListFile {
    public static void main(String[] args) {
        File f=new File("./src/com/ky/javaio");
        File[] files=f.listFiles();
        for(File ff:files){
            System.out.println(ff.getName());
        }
    }
}
