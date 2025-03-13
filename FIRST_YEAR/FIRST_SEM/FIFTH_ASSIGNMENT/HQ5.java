package FIRSTSEM.FIRSTASSIGNMENT.FIVEASSIGNMENT;

import java.util.Scanner;

public class HQ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number = ");
        int n = sc.nextInt();
        int a = 0,b = 1,c = 0;int i = 0;
        System.out.print(a + " " + b + " ");
        while(i <= n){
            c = a+b;
            System.out.print(c + " ");
            a = b;
            b = c;
            i++;
        }
    }
}
