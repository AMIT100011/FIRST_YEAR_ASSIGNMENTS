package FIVEASSIGNMENT;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two number = ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        int fact = 1;

        for (int i = x; i <= y ; i++) {
            fact = 1;
            for (int j = 1; j <= i; j++) {
                fact = fact * j;

            }
            System.out.println(fact + " ");
        }
    }
}
