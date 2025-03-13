package FIRSTSEM.FIRSTASSIGNMENT.FIVEASSIGNMENT;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number = ");
        int n = sc.nextInt();int sum = 0;
        for (int i = 0 ; i <= n ; i++) {
            sum = sum + (1 + i) ;
        }
        System.out.println(sum);
    }
}
