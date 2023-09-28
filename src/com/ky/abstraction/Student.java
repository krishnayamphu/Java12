package com.ky.abstraction;

public class Student implements School {
    String studentName;

    public static void main(String[] args) {
        Student s=new Student();
        s.studentName="Hari";
        System.out.println("Student's Name: "+s.studentName);
        System.out.println("School's Phone No.:"+School.phone);
    }
}
