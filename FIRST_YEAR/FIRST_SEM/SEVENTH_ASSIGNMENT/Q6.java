package FIRSTSEM.FIRSTASSIGNMENT.SEVENTHASSIGNMENT;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number = ");
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        reverse(arr);
    }

    private static void reverse(int[] arr) {
        int temp = 0;int i = 0;int j = arr.length - 1; ;
        while( i < j){
               swap(i,j,arr);
                       i++;j--;
        }
        for (int k : arr) {
            System.out.print(k + " ");
        }
        System.out.println();
    }

    private static void swap(int  i, int j,int [] arr) {
        int temp =0;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
