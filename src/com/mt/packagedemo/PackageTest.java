package com.mt.packagedemo;
import com.mt.p1.Student;
public class PackageTest {
    public static void main(String[] args) {
        Student s=new Student();
        s.name="Ram";
        s.address="KTM";
        System.out.println(s.name+ " ("+s.address+")");
    }
}
