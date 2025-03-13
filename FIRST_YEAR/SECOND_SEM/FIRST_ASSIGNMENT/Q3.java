package FIRSTASSIGNMENT;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int prod = 1;
        while(num > 0){
            int rem = num % 10;
            sum = sum + rem;
            prod = prod * rem;
            num = num / 10;
        }
        if(sum ==  prod){
            System.out.println("spy number");
        }
        else{
            System.out.println("not a spy number");
        }
    }
}
