
import java.util.Scanner;

class shape {

    String colour;

    shape(String c) {
        this.colour = c;
    }
}

class circle extends shape {

    double radius;

    circle(String c, double r) {
        super(c);
        this.radius = r;
    }

    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    void display() {
        System.out.println("Colour : " + this.colour);
        System.out.println("Area : " + calculateArea(this.radius));
    }
}

class Rectangle extends shape {

    double length;
    double width;

    Rectangle(String c, double l, double w) {
        super(c);
        this.length = l;
        this.width = w;
    }

    double calculateArea() {
        return length * width;
    }

    void display() {
        System.out.println("Colour : " + this.colour);
        System.out.println("Area : " + calculateArea());
    }
}

public class Q7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        System.out.print("Enter colour of circle: ");
        String colour = sc.next();
        circle c = new circle(colour, radius);
        c.display();

        System.out.print("Enter length and width of rectangle: ");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        System.out.print("Enter colour of rectangle: ");
        String colourr = sc.next();
        Rectangle r = new Rectangle(colourr, length, width);
        r.display();

    }
}
