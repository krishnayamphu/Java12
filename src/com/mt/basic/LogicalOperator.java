package com.mt.basic;

public class LogicalOperator {
    public static void main(String[] args) {
        String username="admin";
        String password="a123";
        if(username=="admin" && password=="a123"){
            System.out.println("Welcome Admin!");
        }else{
            System.out.println("Invalid Username or Password");
        }
    }
}
