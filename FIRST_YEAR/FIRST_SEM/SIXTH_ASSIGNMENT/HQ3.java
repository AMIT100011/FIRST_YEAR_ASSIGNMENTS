package FIRSTSEM.FIRSTASSIGNMENT.SIXASSIGNMENT;

import java.util.Scanner;

public class HQ3 {
    public static void middle(String str){
        int length = str.length();
        int mid = (str.length()/2);
       if(length / 2 == 0){

           System.out.println(str.charAt(mid+1));
       }
       else{
           System.out.println(str.charAt(mid));
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a line = ");
        String str = sc.nextLine();
        middle(str);
    }
}
