package SIXASSIGNMENT;

import java.util.Locale;
import java.util.Scanner;

public class Q7 {
    public static int count(String str)
    {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length() ; i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ){
                count++;

            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number = ");
        String str = sc.nextLine();
        System.out.println(count(str));
    }
}
