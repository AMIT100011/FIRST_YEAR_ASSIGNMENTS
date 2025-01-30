package SEVENTHASSIGNMENT;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number = ");
        int [] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(" enter the number to be searched ");
        int target = sc.nextInt();
        int s = search(arr,target);
        System.out.println(s);
        System.out.println("occurence = " +  occur(target,arr));
    }

    private static int occur(int s , int [] arr) {
        int count = 0;
        for (int i = 0; i < arr.length-1 ; i++) {
            if(arr[i] == s){
                count++;
            }
        }
        return count;
    }

    private static int search(int[] arr, int key) {
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

}
