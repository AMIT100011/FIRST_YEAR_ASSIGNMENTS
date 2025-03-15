
import java.util.*;

class Car {

    String model;
    int year;

    void setDetails(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void displayDetails() {
        System.out.println("Model name : " + model + " in year : " + year);
    }

    static void compareCars(Car car1, Car car2) {
        if (car1.year > car2.year) {
            System.out.println(car1.model + " is newer.");
        } else if (car1.year < car2.year) {
            System.out.println(car2.model + " is newer.");
        } else {
            System.out.println("Both cars are of the same year.");
        }
    }

}

public class Q1 {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.model = "Toyota";
        car1.year = 2020;
        Car car2 = new Car();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter car model: ");
        String model = sc.nextLine();
        System.out.print("Enter manufacturing year: ");
        int year = sc.nextInt();

        car2.setDetails(model, year);

        car1.displayDetails();
        car2.displayDetails();

        System.out.println();
        Car.compareCars(car1, car2);
    

    }
}
