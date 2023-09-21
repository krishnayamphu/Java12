package com.ky.oop;

public class Student {
    String studentName;
    static String schoolName="ABC School";
    static String phone;

    static { phone="01-2345678"; }
    public static void addressInfo(){
        System.out.println("Address: Kumaripati, Lalitpur");
    }

    public static void main(String[] args) {
        Student s1,s2;
        s1=new Student();
        s2=new Student();
        s1.studentName="Ram";
        s2.studentName="Hari";
        System.out.println("Student Name: "+s1.studentName);
        System.out.println("School Name: "+Student.schoolName);
        Student.addressInfo();
        System.out.println("Student Name: "+s2.studentName);
        System.out.println("School Name: "+schoolName);
        addressInfo();

        System.out.println("===============");
        System.out.println("School's Telephone No.: "+phone);
    }
}
