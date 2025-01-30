package THIRDASSIGNMENT;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if(x > y && y >z){
            System.out.println("dsc");
        }
        else if(x < y && y < z){
            System.out.println("asc");
        }
        else{
            System.out.println("neither");
        }
    }
}
