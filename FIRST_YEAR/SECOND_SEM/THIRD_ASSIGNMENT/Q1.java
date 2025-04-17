
import java.util.*;

class Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter your lucky number: ");
            int luckyNumber = sc.nextInt();
            if (luckyNumber < 0) {
                throw new NumberFormatException("Negative number entered.");
            }
            System.out.println("Your lucky number is: " + luckyNumber);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a positive number only.");
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
