package Packstud;

import java.util.Scanner;

public class Student {

    public String name;
    public int roll;

    public void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        name = sc.next();
        System.out.println("enter roll no");
        roll = sc.nextInt();

    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
    }
}
