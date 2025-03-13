package FIRSTSEM.FIRSTASSIGNMENT.SIXASSIGNMENT;

import java.util.Scanner;

public class HQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number = ");
        String str = sc.nextLine();
        System.out.println(check(str));
    }

    private static char check(String str) {
        for (int i = 0; i < str.length() ; i++) {
            boolean found = false;
            for (int j = 0; j < str.length() ; j++) {
                if(i!=j && str.charAt(i) == str.charAt(j)){
                    found = true;
                }
            }
            if(found==false)
                return str.charAt(i);
        }
        return 0;
    }
}
