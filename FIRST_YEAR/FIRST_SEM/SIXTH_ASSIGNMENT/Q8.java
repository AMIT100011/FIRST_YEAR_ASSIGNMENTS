package FIRSTSEM.FIRSTASSIGNMENT.SIXASSIGNMENT;

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
        String sum = "";int len = dupstr.length();
        for (int i = 0; i < len/2 ; i++) {
           if(dupstr.charAt(i) != dupstr.charAt(len-i-1)){
               return false;
           }

        }
        return true;
    }
}





//    private static boolean isPalindrome(String str)
//    {
//        str = str.toLowerCase();
//        if(str.equals(palindrome(str))){ return true;}
//        return false;
//    }