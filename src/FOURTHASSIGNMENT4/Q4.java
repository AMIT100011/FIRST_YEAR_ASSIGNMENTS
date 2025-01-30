package FOURTHASSIGNMENT4;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        while(y!=0)
        {
            int temp = y;
            y = x % y;
            x = temp;
        }
        System.out.println(" GCD IS " +x);
    }
}
