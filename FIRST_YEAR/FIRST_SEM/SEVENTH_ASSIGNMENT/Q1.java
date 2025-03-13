package FIRSTSEM.FIRSTASSIGNMENT.SEVENTHASSIGNMENT;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number = ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        average(arr);


    }

    private static void average(int[] arr) {
        int totsum = sum(arr);int n = arr.length;
        System.out.println(totsum);
        double avg;
        avg = (double)totsum / n;
        System.out.println(avg);


    }

    private static int sum(int[] arr) {
int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
