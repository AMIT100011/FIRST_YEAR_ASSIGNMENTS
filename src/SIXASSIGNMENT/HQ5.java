package SIXASSIGNMENT;

import java.util.Scanner;

public class HQ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a line = ");
        int num = sc.nextInt();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        consecutive(num,num1,num2);
    }

    private static void consecutive(int x , int y , int z) {
       if (y == (x+1) && z == (x+2)){
           System.out.println("consecutive");
       }
       else{
           System.out.println("not consecutive");
       }
    }

}
