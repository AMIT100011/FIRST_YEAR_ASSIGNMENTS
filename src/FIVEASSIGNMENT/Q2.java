package FIVEASSIGNMENT;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two number = ");
        int x = sc.nextInt();
        int sump = 0 , revsum = 0;
        int count =0,count2 = 0;
        for (int i = 1; i <= x; i++) {
              if (x % i == 0){
                  count++;
              }
        }
        int x1 = x;
        while (x1 > 0){
            int rem = x1 % 10;
            sump = (sump * 10) + rem;
            x1 = x1 / 10;
        }
        for (int i = 1; i <= sump; i++) {
            if (sump % i == 0){
                count2++;
            }
        }
        if (count == 2 && count2 == 2){
            System.out.println("twisted prime ");
        }
        else{
            System.out.println("not twisted prime");
        }
    }
}
