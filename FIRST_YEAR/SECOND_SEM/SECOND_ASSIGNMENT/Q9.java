
import java.util.Scanner;

class Employee {

    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayEmployeeInfo() {
        System.out.println("Name : " + this.name);
        System.out.println("Salary : " + this.salary);
    }

}

class Manager extends Employee {

    String department;

    Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    void displayManagerDetails() {
        super.displayEmployeeInfo();
        System.out.println("Name : " + this.department);

    }
}

public class Q9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name : ");
        String name = sc.next();
        System.out.println("Enter salary : ");
        double salary = sc.nextDouble();
        System.out.println("Department : ");
        String department = sc.nextLine();
        Manager m = new Manager(name, salary, department);
        m.displayManagerDetails();
    }
}
