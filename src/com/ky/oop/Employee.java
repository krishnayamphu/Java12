package com.ky.oop;

public class Employee {
    //no args constructor
    public Employee(){
        System.out.println("Employee instance created.");
    }
    //parameterized constructor
    public Employee(String name){
        System.out.println("Hello "+name);
    }
    public static void main(String[] args) {
        Employee e=new Employee("Ram");
        System.out.println("Hello Employees");
    }
}
