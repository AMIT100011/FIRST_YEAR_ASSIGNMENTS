package FIRSTSEM.FIRSTASSIGNMENT.FOURTHASSIGNMENT4;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int sum = 0;int count = 0;
        do {
            int random = (int)(Math.random() * n ) + 1;
            System.out.println(random + " ");
            sum += random;
            count++;
        }while(count < n);
        double avg = (double)sum / n;
        System.out.println(avg);

    }
}
