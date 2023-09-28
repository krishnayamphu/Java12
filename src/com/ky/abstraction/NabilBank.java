package com.ky.abstraction;

public class NabilBank implements Bank{
    public static void main(String[] args) {
        NabilBank bank=new NabilBank();
        bank.bankInfo();
        System.out.println("Bank Interest Rate: "+Bank.getInterestRate());

    }

    @Override
    public void bankInfo() {
        System.out.println("Bank Name: Nabil Bank Ltd.");
        System.out.println("Address: Lagankhel, Lalitpur");
    }
}
