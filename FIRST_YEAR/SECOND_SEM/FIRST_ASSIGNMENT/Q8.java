package FIRSTASSIGNMENT;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("enter");
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum  = 0;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m ; j++) {
                System.out.print(arr[i][j] + " ");
                sum = sum + arr[i][j];
            }
            System.out.println();
        }
        System.out.println(sum);
    }
}
