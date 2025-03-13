package FIRSTSEM.FIRSTASSIGNMENT.SIXASSIGNMENT;

import java.util.Scanner;

public class Q6 {
    public static int count(String str, char a)
    {
        int count = 0;

        for (int i = 0; i < str.length() ; i++) {
            if(str.charAt(i) == a){
                count++;

            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number = ");
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);
        System.out.println(count(str,ch));
    }
}
