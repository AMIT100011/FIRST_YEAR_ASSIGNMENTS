package FIRSTASSIGNMENT;

import java.util.Scanner;

public class HQ3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of both the array: ");
        int n=sc.nextInt();
        int []a=new int[n];
        int []b=new int[n];
        int[]c=new int[n];
        System.out.print("Element of first array: ");
        for(int i=0;i<a.length;i++) {
            a[i]=sc.nextInt();
        }System.out.print("Element of second array: ");
        for(int j=0;j<b.length;j++) {
            b[j]=sc.nextInt();
        }
        for (int i = 0; i < c.length; i++) {
            c[i] = a[i] * b[i];
        }
        for (int i = 0; i < c.length ; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
