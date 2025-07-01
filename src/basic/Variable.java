package basic;

import java.util.Scanner;

public class Variable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of x: ");
        int x=sc.nextInt();
        System.out.println(x);

        System.out.print("enter name:");
        String name=sc.next();
        System.out.println(name);
    }
}
