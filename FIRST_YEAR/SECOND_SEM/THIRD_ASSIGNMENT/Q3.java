
class MarksOutOfBoundException extends Exception {

    public MarksOutOfBoundException(String message) {
        super(message);
    }
}

class Student {

    String name;
    int marks;

    public Student(String name, int marks) throws MarksOutOfBoundException {
        this.name = name;

        if (marks > 100) {
            throw new MarksOutOfBoundException("Marks cannot be greater than 100.");
        }

        this.marks = marks;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class Q3 {

    public static void main(String[] args) {
        try {
            Student student = new Student("AMIT", 105); // Change value to test
            student.display();
        } catch (MarksOutOfBoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
