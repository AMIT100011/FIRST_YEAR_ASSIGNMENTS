package Packstud;

import Sport.*;

public class result extends Test implements sports {

    public void showTotal() {
        int grandTotal = mark1 + mark2 + score1 + score2;
        showDetails();
        System.out.println("Score1: " + score1);
        System.out.println("Score2: " + score2);
        System.out.println("Grand Total: " + grandTotal);
    }

    public static void main(String[] args) {
        result studentResult = new result();
        studentResult.inputDetails();
        studentResult.showTotal();
    }
}
