package FIRSTSEM.FIRSTASSIGNMENT.FIVEASSIGNMENT;

import java.util.Scanner;

public class HQ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number and x in radians = ");

        double x = sc.nextDouble();
        int term = (int) sc.nextDouble();
        System.out.println(series(x,term));

    }

    private static double series(double x,int terms) {
        double cosx = 0; int a =1;
        for (int i = 0; i <= terms ; i += 2) {
            double fact = 1;
            for (int j = 1; j <= i; j++) {
                fact = fact * j;
            }
            double sum =  Math.pow(x, i) / fact * a ;
            cosx = cosx + sum;
            a *= -1;
        }
        return cosx;
    }
}
