package FIRSTSEM.FIRSTASSIGNMENT.SECONDASSIGNMENT;

import java.util.Scanner;

public class HQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int gross = x / 144;
        x = x % 144;
        int dozen = x / 12;
        int left = x % 12;
        System.out.println(gross);
        System.out.println(dozen);
        System.out.println(left);


    }
}
