package FIRSTASSIGNMENT;

import java.util.Scanner;

public class Q5 {
    public static int sumofdigits(int n ){
       int sum = 0 ;int m = 0;
        while(n > 9){
          sum = 0;
          m = n;
            while(m > 0){
            int rem = m % 10;
            sum =  sum + rem;
            m = m / 10;
        }
            n = sum;
    }
    return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int s = sumofdigits(num);
        System.out.println(s);
    }
}
