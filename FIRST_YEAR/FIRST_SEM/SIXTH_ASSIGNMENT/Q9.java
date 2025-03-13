package FIRSTSEM.FIRSTASSIGNMENT.SIXASSIGNMENT;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number = ");
        String str = sc.nextLine();
        Password(str);
    }

    private static void Password(String str) {

        if(str.length() < 8) {
            System.out.println("invalid password");
            return;
        }
        int c = 0;
        for (int i = 0; i < str.length() ; i++) {
            if(!((str.charAt(i) >= 'a') && (str.charAt(i) <= 'z') || (str.charAt(i) >= 'A') && (str.charAt(i) <= 'Z') ||(str.charAt(i) >= '0') && (str.charAt(i) <= '9')))
            {
                System.out.println("Invalid password");
                return;
            }
            }
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >='0' && str.charAt(i)<='9'){
                c++;
        }
        }
        if (c<2){
            System.out.println("inValid Password");
            return;
        }
        System.out.println("valid password");
    }
}
