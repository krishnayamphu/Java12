package com.mt.exceptions;

public class ThrowDemo {
    public void checkVoterAge(int age) throws ArithmeticException{
        if(age>=18){
            System.out.println("You are eligible to vote");
        }else{
            throw new ArithmeticException("you are under 18.");
        }
    }

    public static void main(String[] args) {
        ThrowDemo demo=new ThrowDemo();
        try{
            demo.checkVoterAge(10);
        }catch (ArithmeticException e){
            System.err.println(e);
        }
    }
}
