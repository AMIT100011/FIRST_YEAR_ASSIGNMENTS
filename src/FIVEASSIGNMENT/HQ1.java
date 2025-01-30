package FIVEASSIGNMENT;

import java.util.Scanner;

public class HQ1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number = ");
        int n = sc.nextInt();
//        for (int i = 1; i <= n ; i++)
//        {
//            for (int j = n; j > 0 ; j--)
//            {
//            if(j == n - i + 1){
//                System.out.print("*");
//            }
//            else{
//                System.out.print(j + " ");
//            }
//            }
//            System.out.println();
//        }
        for (int i = 1; i <= n ; i++)
        {
            for (int j = n; j > 0 ; j--)
            {
            if(j == i){
                System.out.print("*" + " ");
            }
            else{
                System.out.print(j + " ");
            }
            }
            System.out.println();
        }
    }
}
