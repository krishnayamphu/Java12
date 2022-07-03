package com.mt.inheritance;

public class PrasadiSchool extends School {
    public PrasadiSchool(String name){
        super(name);
        super.schoolInfo();
    }

    public static void main(String[] args) {
        PrasadiSchool prasadi=new PrasadiSchool("Prasadi Academy");
        prasadi.schoolInfo();
        System.out.println("School: "+prasadi.name);
    }
}
