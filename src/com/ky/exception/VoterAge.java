package com.ky.exception;

import java.security.KeyPair;

public class VoterAge {
    public void checkAge(int age) throws ArithmeticException {
        if(age<18){
            throw new ArithmeticException("Invalid voter age");
        }else {
            System.out.println("you can vote");
        }
    }

    public static void main(String[] args) {
        try{
            VoterAge age=new VoterAge();
            age.checkAge(5);
        }catch (ArithmeticException e){
        System.err.println(e);
    }}
}
