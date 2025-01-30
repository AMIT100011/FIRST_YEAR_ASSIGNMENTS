package SIXASSIGNMENT;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number = ");
        String str = sc.nextLine();
        Password(str);
    }

    private static void Password(String str) {
        char ch;str = str.toLowerCase();
        if(str.length() < 8) return;
        int numcount = 0;
        for (int i = 0; i < str.length() ; i++) {
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                if(str.charAt(i) >= 0 && str.charAt(i) <= 9){
                    System.out.println("Valid Password");
                }
                else{
                    System.out.println("Invalid password");
                }
            }
        }
    }
}
