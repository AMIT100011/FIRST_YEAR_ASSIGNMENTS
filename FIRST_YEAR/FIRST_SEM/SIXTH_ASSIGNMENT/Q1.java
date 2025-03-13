package FIRSTSEM.FIRSTASSIGNMENT.SIXASSIGNMENT;

import java.util.Scanner;

public class Q1 {
    private static int add(int x, int y) {
        return x + y;
    }
    private static int substract(int x, int y) {
            return x - y;
    }
    private static int multiplication(int x, int y) {
            return x * y;
    }
    private static double division(int x, int y) {
        int i = x / y;
        return  i;
    }
    private static int remainder(int x, int y) {
    return x % y;
    }
    private static double squareroot(int x) {
        return  Math.sqrt(x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number = ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int addition  = add(a,b);
        int subs = substract(a,b);
        int mul = multiplication(a,b);
        double div = division(a,b);
        int rem = remainder(a,b);
        double sq = squareroot(a);
        System.out.println(addition);
        System.out.println(subs);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(rem);
        System.out.println(sq);
    }



}
