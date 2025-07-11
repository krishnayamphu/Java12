package OOP.inheritance;

import javax.swing.*;

class Animal{
    String color;
}
class Bird extends Animal{
    public String name;
}
public class Sparrow extends Bird{
    public static void main(String[] args) {
        Sparrow sparrow=new Sparrow();
        sparrow.name="Sparrow";
        sparrow.color="Brown";

        System.out.println(sparrow.name);
        System.out.println(sparrow.color);
    }
}
