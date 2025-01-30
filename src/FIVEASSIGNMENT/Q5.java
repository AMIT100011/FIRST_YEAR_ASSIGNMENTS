package FIVEASSIGNMENT;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two number = ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        int p =0;

        for (int i = x; i <= y ; i++) {
            for (int j = 0; j <= 10 ; j++) {
                p = i * j;
                System.out.println(i + " * " + j + " = " + p);
            }
        }
    }
}
