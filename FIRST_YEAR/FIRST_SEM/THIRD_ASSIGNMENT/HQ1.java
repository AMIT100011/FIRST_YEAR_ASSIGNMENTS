package FIRSTSEM.FIRSTASSIGNMENT.THIRDASSIGNMENT;

import java.util.Scanner;

public class HQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter today");
        int today = sc.nextInt();
        System.out.println("enter time elapsed");
        int dayselapsed = sc.nextInt();
        String futday = " ";

        switch (today){
            case 0 : futday = "Sunday";break;
            case 1 : futday = "Monday";break;
            case 2 : futday = "Tuesday";break;
            case 3 : futday = "Wednesday";break;
            case 4 : futday = "THursday";break;
            case 5 : futday = "Friday";break;
            case 6 : futday = "SAturday";break;
        }
        String futdayela = " ";
        int ftday = (today + dayselapsed)%7;
        switch (ftday){
            case 0 : futdayela = "Sunday";break;
            case 1 : futdayela = "Monday";break;
            case 2 : futdayela = "Tuesday";break;
            case 3 : futdayela = "Wednesday";break;
            case 4 : futdayela = "THursday";break;
            case 5 : futdayela = "Friday";break;
            case 6 : futdayela = "SAturday";break;

        }
        System.out.println("today is " + futday + " future day after elapsed " + futdayela);
    }
}
