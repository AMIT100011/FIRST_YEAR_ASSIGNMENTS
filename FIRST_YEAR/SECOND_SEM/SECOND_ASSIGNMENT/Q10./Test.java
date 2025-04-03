package Packstud;
import Packstud.Student.*;
import java.util.Scanner;

public class Test extends Student{

    public int mark1, mark2;

   public void inputDetails() {
        super.inputDetails();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Mark1: ");
        mark1 = sc.nextInt();
        System.out.print("Enter Mark2: ");
        mark2 = sc.nextInt();

    }

    public void showDetails() {
       super.showDetails();
        System.out.println("Mark1: " + mark1);
        System.out.println("Mark2: " + mark2);
    }

}
