package FIRSTSEM.FIRSTASSIGNMENT.THIRDASSIGNMENT;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x > 0 && y > 0){
            System.out.println("first quad");
        } if(x < 0 && y > 0){
            System.out.println("second quad");
        }
        if(x < 0 && y < 0){
            System.out.println("third quad");
        }
        if(x > 0 && y < 0){
            System.out.println("fourth quad");
        }
    }
}
