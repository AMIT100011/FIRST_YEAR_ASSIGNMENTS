package SIXASSIGNMENT;

import java.util.Scanner;


public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number = ");
        String str = sc.nextLine();
        boolean p = palindrome(str);
        System.out.println(p);

    }

    public static boolean palindrome(String dupstr){
        String sum = "";
        for (int i = 0; i < dupstr.length() ; i++) {
            sum = sum + dupstr.charAt(i);
        }
        return (sum.equalsIgnoreCase(dupstr));
    }
}





//    private static boolean isPalindrome(String str)
//    {
//        str = str.toLowerCase();
//        if(str.equals(palindrome(str))){ return true;}
//        return false;
//    }