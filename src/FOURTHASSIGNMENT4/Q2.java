package FOURTHASSIGNMENT4;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;int sum = 0;
        while (m>0){
            int rem = m % 10;
            sum = sum + rem;
            m = m / 10;
        }
        if(sum % 9 ==0){
            System.out.println("divisible ");
        }
        else{
            System.out.println("not divisible");
        }
    }
}
