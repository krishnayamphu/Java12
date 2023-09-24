package com.ky.inheritance;
class Address{
    String city,state,country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }
}
class Student{
    String name;
    Address address;

    public Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    public void stdInfo(){
        System.out.println("Student Name: "+name);
        System.out.println("Student Address: "+address.city+", "+address.state+", "+address.country);
    }
}
public class Aggregation {
    public static void main(String[] args) {
        Address address=new Address("Patan","Bagmati","Nepal");
        Student s=new Student("Hari",address);
        s.stdInfo();
    }
}
