package com.ky.exception;

public class FinallyBlock {
    public static void main(String[] args) {
        try{
            System.out.println("statement 1");
            System.out.println(20/0);
            System.out.println("statement 2");
        }
        catch (Exception e){
            System.err.println(e);
        }
        finally {
            System.out.println("finally you reached at the end.");
        }
    }
}
