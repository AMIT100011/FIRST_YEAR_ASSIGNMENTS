package FIRSTSEM.FIRSTASSIGNMENT.SIXASSIGNMENT;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number = ");
        int b = sc.nextInt();
        int h = sc.nextInt();
        int s = sc.nextInt();
        int r = sc.nextInt();
        int rl = sc.nextInt();
        int rb = sc.nextInt();
        triangle(b,h);
        square(s);
        circle(r);
        rectangle(rl,rb);
    }

    private static void rectangle(int rl, int rb) {
        double area = rl * rb;
        System.out.println(area);
    }

    private static void circle(int r) {
        double area = Math.PI * r * r;
        System.out.println(area);
    }

    private static void square(int s) {
        double area = s * s;
        System.out.println(area);
    }

    private static void triangle(int b, int h) {
        double area = (1.0/2) * (b * h);
        System.out.println(area);
    }
}
