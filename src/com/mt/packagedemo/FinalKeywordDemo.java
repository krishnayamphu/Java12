package com.mt.packagedemo;
class School{
    final String name="ABC School"; //constant
    public final void schoolStartTime(){ //prevent override method
        System.out.println("School start at: 10:00am");
    }
}
class UnitedAcademy extends School{

    /*@Override
    public void schoolStartTime(){
        System.out.println("School start at: 9:00am");
    }*/
}
public class FinalKeywordDemo {
    public static void main(String[] args) {
        School school=new School();
        //school.name="XYZ School";
    }
}
