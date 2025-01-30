package SEVENTHASSIGNMENT;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number = ");
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        double sec = secLargest(arr);
        System.out.println("Second largest value is = " + sec);

}
    private static double secLargest(int[] arr){
        int i;int seclargest = -1;int largest = -1;
        for ( i = 0; i < arr.length ; i++) {
            if(arr[i] > largest){
                largest = arr[i];
            }}
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] < largest){
                seclargest = Math.max(arr[j],seclargest);
//
            }
        }


        return seclargest;
    }
    }

