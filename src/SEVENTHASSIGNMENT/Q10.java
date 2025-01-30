package SEVENTHASSIGNMENT;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int newArr = duplicates(arr);
        for (int i = 0; i < newArr; i++) {
             System.out.print(arr[i] + " ");
        }

    }

    private static int duplicates(int[] arr) {
        int [] temp = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int k = 0; k < arr.length  ; k++) {
                if(arr[i] != arr[k]){
                    temp[j++] = arr[i];
                    break;
                }
            }
        }
        temp[j++] = arr[arr.length-1];
        for (int i = 0; i < j ; i++) {
            arr[i] = temp[i];
        }
        return j;
    }

}
