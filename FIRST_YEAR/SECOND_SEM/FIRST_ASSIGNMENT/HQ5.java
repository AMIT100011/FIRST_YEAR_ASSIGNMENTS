package FIRSTASSIGNMENT;

import java.util.*;

public class HQ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[4][4];
        Random random = new Random();
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                a[i][j] = random.nextInt(2);
            }
        }
        System.out.println("Generated 4x4 Matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        int maxRow = 0;
        int maxRowCount = 0;
        for (int i = 0; i < 4; i++) {
            int count = 0;
            for (int j = 0; j < 4; j++) {
                if (a[i][j] == 1) {
                    count++;
                }
            }
            if (count > maxRowCount) {
                maxRowCount = count;
                maxRow = i;
            }
        }
        int maxCol = 0;
        int maxColCount = 0;
        for (int j = 0; j < 4; j++) {
            int count = 0;
            for (int i = 0; i < 4; i++) {
                if (a[i][j] == 1) {
                    count++;
                }
            }
            if (count > maxColCount) {
                maxColCount = count;
                maxCol = j;
            }
        }
        System.out.println("Row with the most 1s: " + maxRow);
        System.out.println("Column with the most 1s: " + maxCol);
    }
}
