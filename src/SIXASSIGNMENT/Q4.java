package SIXASSIGNMENT;

import java.util.Scanner;

public class Q4 {
    public static int noOfyear(int year){
        int days;
        if(year % 4 == 0 || year % 100 != 0 && year % 400 ==0){
            return 366;
        }
        else{
            return 365;
        }

    }
    public static void range(int x ,int y){
        int days;
        for (int i = x; i <= y ; i++) {
            System.out.println( i + " = " + noOfyear(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number = ");


        int a = sc.nextInt();
        int b = sc.nextInt();

        range(a,b);
    }
}
