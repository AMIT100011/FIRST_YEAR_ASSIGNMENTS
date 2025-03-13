package FIRSTASSIGNMENT;

import java.util.Scanner;

public class Q10 {
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (int i = 0; i < m.length ; i++) {
            sum = sum + m[i][columnIndex];
        }
        return sum;
    }
    public static void columnsum(double[][] m){
        double sum  = 0;
        for (int j = 0; j < m.length ; j++) {
            sum = 0;
            for (int i = 0; i < m.length ; i++) {
                sum  = sum + m[i][j];
            }
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        double[][] arr = new double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextDouble();
            }
        }
//        System.out.println("enter the column");
//        int col = sc.nextInt();
//        double sum = sumColumn(arr, col);
        columnsum(arr);
//        System.out.println(sum);
    }
}