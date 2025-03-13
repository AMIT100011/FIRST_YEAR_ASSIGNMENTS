package FIRSTASSIGNMENT;

import java.util.Scanner;

public class Q9 {
    public static double sumMajorDiagonal(double[][] m){
        double sum  = 0;int len  = m.length;
        for (int i = 0; i < len ; i++) {
            for (int j = 0; j < len ; j++) {
               if(i == j){
                   sum = sum + m[i][j];
               }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        double[][] arr = new double[n][m];
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m ; j++) {
                arr[i][j] = sc.nextDouble();
            }
        }
        double sum = sumMajorDiagonal(arr);
        System.out.println(sum);


    }
}
