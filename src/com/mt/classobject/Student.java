package com.mt.classobject;

public class Student {
    String name;
    int rollno;
    void getSchoolName()
    {
        System.out.println("school: Aptech");
    }
    public static void main(String[] args) {
        Student s=new Student();
        s.name="Ram";
        s.rollno=10;
        System.out.println("Name: "+s.name);
        System.out.println("Rollno.:"+s.rollno);
        s.getSchoolName();
    }
}
