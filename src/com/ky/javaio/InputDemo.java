package com.ky.javaio;

import java.io.InputStreamReader;
import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(new InputStreamReader(System.in));
        System.out.print("Enter age:");
        int age=scanner.nextInt();
        System.out.println("Age: "+age);
    }
}
