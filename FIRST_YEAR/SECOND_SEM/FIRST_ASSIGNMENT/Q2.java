package FIRSTASSIGNMENT;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter person Weight in kg: ");
        double w=sc.nextDouble();
        System.out.print("Enter height of person in meter: ");
        double h=sc.nextDouble();
        double bmi=w/(h*h);
        if(bmi<18.5)
            System.out.println("The person is Under weight");
        else if(bmi>=18.5&&bmi<=24.9)
            System.out.println("The person is Normal weight");
        else if(bmi>=25.0&&bmi<=29.9)
            System.out.println("The person is Over weight");
        else if(bmi>30.0)
            System.out.println("The person is Obese");



    }
}
