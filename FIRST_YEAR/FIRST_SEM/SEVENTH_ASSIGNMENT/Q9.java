package FIRSTSEM.FIRSTASSIGNMENT.SEVENTHASSIGNMENT;

import java.util.Scanner;

public class Q9 {
    public static double mean(double[] x){
        int n = x.length;double sum = 0;
        for (int i = 0 ; i < n ; i++) {
            sum = sum + x[i];
        }
        return sum / n;
    }
    public static double deviation(double[] x){
        int n = x.length;double sum = 0.0;
        double m = mean(x);
        for (int i = 1; i <= n; i++) {
            sum += Math.pow((x[i-1] - m),2);
        }

        return Math.sqrt(sum/(n-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array");
        double[] arr = new double[10];
        for (int i = 0; i < arr.length; i++) {
           arr[i] = sc.nextDouble();
        }
        System.out.println("the mean is = " + mean(arr));
        System.out.println("the deviation is = " + deviation(arr));

    }
}
