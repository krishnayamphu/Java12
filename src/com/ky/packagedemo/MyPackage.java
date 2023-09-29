package com.ky.packagedemo;

//import com.ky.p1.Animal;
import com.ky.p1.Employee;
import com.ky.p1.Student;
//import com.ky.p1.*;

import javax.swing.JOptionPane;

public class MyPackage {
    public static void main(String[] args) {
        Employee e=new Employee();
        com.ky.p1.Animal dog=new com.ky.p1.Animal();
//        JOptionPane.showMessageDialog(null,"Hello World");
        Student s=new Student();
//        s.name="Hari";
        s.setName("Ram");
        System.out.println(s.getName());
           }
}
