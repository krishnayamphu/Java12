package com.ky.inheritance;

class Bank {
    String name;

    public Bank(String name) {
        this.name = name;
    }

    public void bankInfo() {
        System.out.println("Showing bank info:");
    }
}

class SanimaBank extends Bank {
    String address;

    public SanimaBank(String name, String address) {
        super(name);
        this.address = address;
    }

    public void showBankDetail() {
        super.bankInfo();
        System.out.println("Bank Name: " + super.name);
        System.out.println("Address: " + this.address);
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        SanimaBank bank = new SanimaBank("Sanima", "Kumaripati, Lalitpur");
        bank.showBankDetail();
    }
}
