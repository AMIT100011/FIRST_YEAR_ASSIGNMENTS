package THIRDASSIGNMENT;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age > 18){
            System.out.println("eligible");
        }
        else{
            System.out.println("not");
        }

    }
}
