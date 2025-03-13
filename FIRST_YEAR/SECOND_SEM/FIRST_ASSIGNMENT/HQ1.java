package FIRSTASSIGNMENT;

import java.util.Scanner;

public class HQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if((a+b==c) && (a == b -c) && (a*b == c) )
            System.out.println("It is an correct arithmetic formula");
        else
            System.out.println("It is not an correct arithmetic formula");

    }
}
