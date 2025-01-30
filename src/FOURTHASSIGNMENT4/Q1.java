package FOURTHASSIGNMENT4;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int sum = 0;
        for(int i = x ; i <= y ; i = i+ z){
            sum += i;
            System.out.print(i + " ");

        }
        System.out.println(sum);
    }
}
