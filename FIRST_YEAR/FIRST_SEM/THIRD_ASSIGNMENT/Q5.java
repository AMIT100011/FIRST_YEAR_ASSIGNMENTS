package FIRSTSEM.FIRSTASSIGNMENT.THIRDASSIGNMENT;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yr = sc.nextInt();
        if(yr % 4 == 0 && yr % 100 !=0 || yr % 400 == 0){
            System.out.println("leap");
        }
        else{
            System.out.println("not");
        }
    }
}
