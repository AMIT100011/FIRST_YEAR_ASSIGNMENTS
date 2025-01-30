package SIXASSIGNMENT;

import java.util.Scanner;

public class Q5 {
    public static double area(int n, double side){
        double area = 0;
        area = (n * Math.pow(side,2))/(4 * Math.tan((Math.PI)/n));
        return area;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number = ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(area(a,b));
    }
}
