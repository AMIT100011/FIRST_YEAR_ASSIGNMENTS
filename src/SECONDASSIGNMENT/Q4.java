package SECONDASSIGNMENT;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = x% 10;
        x = x/10;
        int b = x% 10;
        x = x/10;
        int c = x% 10;
        x = x/10;
        System.out.println(a+b+c);

    }
}
