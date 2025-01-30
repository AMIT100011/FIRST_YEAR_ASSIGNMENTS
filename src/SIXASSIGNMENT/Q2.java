package SIXASSIGNMENT;

import java.util.Scanner;

public class Q2 {
    private static int Pentagonal(int n) {

            return (n * (3 * n - 1)) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number = ");
        for (int i = 1; i < 101; i++) {
            System.out.print(Pentagonal(i) + " ");
            if (i % 10 == 0){
                System.out.println();
        }}

    }
}
