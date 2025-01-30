package SEVENTHASSIGNMENT;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number = ");
        double[] arr = new double[10];
        for (double i = 0; i < arr.length; i++) {
            arr[(int) i] = sc.nextDouble();
        }
        double min = minimum(arr);
        System.out.println("Minimum value is = " + min);

    }
        private static double minimum(double[] arr){
        int i;
            for ( i = 1; i < arr.length ; i++) {
                if(arr[i] < arr[i-1]){
                    arr[i-1] = arr[i];
                }
                else{
                    arr[i] = arr[i-1];
                }
            }
            return arr[i-1];
        }
        }
