
import java.util.Scanner;

class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {

    int Eid;
    double salary;

    public Employee(String name, int age, int Eid, double salary) {
        super(name, age);
        this.Eid = Eid;
        this.salary = salary;
    }

    public void empDisplay() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + Eid);
        System.out.println("Salary: " + salary);
    }
}

public class HAQ12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Employee ID: ");
        int Eid = sc.nextInt();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        ;

        Employee emp = new Employee(name, age, Eid, salary);
        emp.empDisplay();
    }
}
