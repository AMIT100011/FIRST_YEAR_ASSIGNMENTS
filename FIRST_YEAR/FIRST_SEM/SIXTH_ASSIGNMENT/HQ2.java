package FIRSTSEM.FIRSTASSIGNMENT.SIXASSIGNMENT;

import java.util.Scanner;

public class HQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number = ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int r = sc.nextInt();
        int s = sc.nextInt();

        cuboid(l,b,h);
        cube(s);
        sphere(r);

    }

    private static void cuboid(int l,int b, int h) {
        double volume = l * b * h;
        System.out.println(volume);
    }

    private static void cube(int s) {
        double volume = s * s * s;
        System.out.println(volume);
    }

    private static void sphere(int r) {
        double volume = (4.0/3) * Math.PI * r * r * r;
        System.out.println(volume);
    }
}
