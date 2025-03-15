
class Vehicle {

    String model;
    int year;

    Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }
}

class Car extends Vehicle {

    int carId;
    double price;

    Car(String model, int year, int carId, double price) {
        super(model, year);
        this.carId = carId;
        this.price = price;
    }

    void display() {

        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Car ID: " + carId);
        System.out.println("Price: $" + price);
    }
}

public class Q6 {

    public static void main(String[] args) {
        Car car1 = new Car("TATA", 2025, 101, 120000);
        System.out.println("Car Details:");
        car1.display();
    }
}
