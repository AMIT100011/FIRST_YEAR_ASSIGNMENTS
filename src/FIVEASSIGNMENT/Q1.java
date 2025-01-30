package FIVEASSIGNMENT;

import java.util.Scanner;

public class Q1 {       // amicable
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two number = ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum1 = 0,sum2 = 0;
        for (int i = 1; i < x ; i++) {
            if (x % i == 0){
                sum1 += i;
            }
        }
        for (int j = 1; j < x ; j++) {
            if (y % j == 0){
                sum2 += j;
            }
        }
        if(x == sum2 && y == sum1){
            System.out.println("amicable pair");
        }
        else{
            System.out.println("not a amicable pair");
        }
    }
}
