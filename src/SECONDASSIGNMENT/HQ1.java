package SECONDASSIGNMENT;

import java.util.Scanner;

public class HQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        long yrs = t / (60 * 24 * 365);
        long remdmins = t % (60 * 24 * 365);
        long days =  remdmins / (60 * 24);
        System.out.println(yrs);
        System.out.println(days);

    }
}
