package FOURTHASSIGNMENT4;
import java.util.Scanner;
public class HQ5 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j < i+1; j++) {
                System.out.print(j + " ");
            }
            if(i%2!=0){
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }
}
