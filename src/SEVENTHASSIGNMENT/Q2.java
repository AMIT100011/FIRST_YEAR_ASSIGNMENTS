package SEVENTHASSIGNMENT;

import java.util.*;

public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number = ");

        int [] arr = new int[101];
        int n;
        int count = 0;
        do{
            n = sc.nextInt();
           if(n >=1 && n <=100){
               arr[n]++;
           }
        }while(n!=0);
        for (int i = 1; i <= 100; i++) {
            if(arr[i]>0){
                if (arr[i] > 1) {
                    System.out.println(i + " occurs " + arr[i] + " times");
                }
                else{
                    System.out.println(i + " occurs " + arr[i] + " time");
                }
                }

        }
    }}


