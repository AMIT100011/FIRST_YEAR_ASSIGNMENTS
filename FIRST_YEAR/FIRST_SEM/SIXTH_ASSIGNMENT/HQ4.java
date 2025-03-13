package FIRSTSEM.FIRSTASSIGNMENT.SIXASSIGNMENT;

import java.util.Scanner;

public class HQ4 {
    public static void cstring(String str){
        int count = 0;
        for (int i = 0; i < str.length() ; i++) {
            if((str.charAt(i) == ' ') && (str.charAt(i+1) != ' ' )){
                count++;
            }
        }
        if(str.charAt(0)==' '){
            System.out.println(count);
        }
        else{
        System.out.println(count+1);}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a line = ");
        String str = sc.nextLine();
        cstring(str);
    }
}
