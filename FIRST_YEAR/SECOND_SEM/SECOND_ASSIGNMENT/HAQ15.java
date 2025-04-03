import java.util.Scanner;

public class PointType {
    public double x,y;
    public PointType(){
        this.x = 0;
        this.y = 0;
    }
    public PointType(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
public double getX(){
        return x;
}
public double getY(){
        return y;
}
    public void printPoint() {
        System.out.println("Point Coordinates: (" + x + ", " + y + ")");
    }
}

class CircleType extends PointType{
    public double radius;
    public CircleType (){
    super();
        this.radius = 0.0;
}

// Parameterized constructor
public CircleType(double x, double y, double radius) {
    super(x, y);
    this.radius = radius;
}

    public double getR(){
        return radius;
    }
    // Method to calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public void printCircle() {
        System.out.println("Circle Details:");
        printPoint(); // Print center using PointType method
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Circumference: " + getCircumference());
    }
    public static void main(String[] args) {
Scanner sc =  new Scanner(System.in);
        System.out.println("enter x coordinate");
        double x = sc.nextDouble();
        System.out.println("enter y coordinate");
        double y = sc.nextDouble();
        System.out.print("Enter Radius of the Circle: ");
        double radius = sc.nextDouble();

        CircleType c =  new CircleType(x,y,radius);
        c.printCircle();

    }
}


