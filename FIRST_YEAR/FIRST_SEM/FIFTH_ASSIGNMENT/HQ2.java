package FIRSTSEM.FIRSTASSIGNMENT.FIVEASSIGNMENT;

import java.util.Scanner;

public class HQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number = ");
        int n = sc.nextInt();
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5-i ; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*" + "   ");
            }
            System.out.println();
        }
    }
}
