package FIRSTASSIGNMENT;

import java.util.Scanner;

public class HQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //int n = sc.nextInt();
        String[] lines = new String[3];
        for (int i = 0; i < 3 ; i++) {
            lines[i] = sc.nextLine();
        }
        for (int i = 2 ; i >= 0 ; i--) {
            System.out.println(lines[i]);
        }

    }
}

