package SEVENTHASSIGNMENT;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number = ");
        int n = sc.nextInt();
        String oct = "";
        if(n == 0){
            System.out.println("octal = " +n);
        }
        else{
        while(n > 0){
            int rem = n % 8;
            oct = rem + oct;
            n = n / 8;

        }
            System.out.println("Octal = " + oct);}
    }
}
