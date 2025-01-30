package FIVEASSIGNMENT;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number = ");
        int n = sc.nextInt();int sum = 0;
        int a = 0 ,b = 1,c = 1;int i = 0;
        System.out.print(a+ "  " + b + "  " + c + "  " );
       while(i <= n) {
            sum = a + b + c;
            System.out.print(sum + " ");
           c = sum;
           b = c;
           a = b;
            i++;

        }

    }
}
