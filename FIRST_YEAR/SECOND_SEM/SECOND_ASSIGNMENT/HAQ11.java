
import java.util.*;

class Student {

    int roll_no;
    String name;
    int mark;
    Scanner sc = new Scanner(System.in);

    void getData() {
        System.out.print("Enter Roll Number: ");
        roll_no = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter DSA Marks: ");
        mark = sc.nextInt();
    }

    void showData() {
        System.out.println("Roll no : " + this.roll_no);
        System.out.println("Enter name : " + this.name);
        System.out.println("Mark : " + this.mark);
        System.out.println("Highest scored by : " + this.name);
    }

    int getDSAMark() {
        return this.mark;
    }
}

public class HAQ11 {

    public static void main(String[] args) {
        Student highestScorer = new Student();

        System.out.println("Enter details for student 1:");
        highestScorer.getData();

        for (int i = 2; i <= 5; i++) {
            Student tempStudent = new Student();
            System.out.println("Enter details for student " + i + ":");
            tempStudent.getData();

            if (tempStudent.getDSAMark() > highestScorer.getDSAMark()) {
                highestScorer = tempStudent;
            }
        }
        System.out.println("\nStudent with the highest DSA Marks:");
        highestScorer.showData();
    }

}
