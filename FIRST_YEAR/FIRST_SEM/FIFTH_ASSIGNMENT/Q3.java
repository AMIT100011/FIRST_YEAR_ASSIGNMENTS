package FIRSTSEM.FIRSTASSIGNMENT.FIVEASSIGNMENT;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two number = ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int c = 0;
        for (int i = x; i <= y; i++) {
            c = 0;
            for (int j = 1; j <=i ; j++) {
                if(i % j == 0) {
                    c++;
                }
            }
                if(c == 2 ){
                    System.out.println(i + " ");
                }
        }
    }
}
