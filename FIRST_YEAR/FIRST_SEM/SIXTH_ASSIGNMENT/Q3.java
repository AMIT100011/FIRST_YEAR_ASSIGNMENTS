package FIRSTSEM.FIRSTASSIGNMENT.SIXASSIGNMENT;

import java.util.Scanner;

public class Q3 {
    private static int reverse(int x) {
        int x1 = x;int sum = 0;
        while(x1 > 0){
            int rem = x1 % 10;
            sum = (sum * 10) + rem;
            x1 = x1 / 10;
        }
        System.out.println(isPalindrome(x,sum));

        return sum;
    }
    private static boolean isPalindrome(int x,int num) {
        if(x == num ){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number = ");
        int x = sc.nextInt();
        int rev = reverse(x);
        System.out.println(rev);
    }



}
