
import java.util.*;

abstract class Shape {

    abstract void calculateArea();
}

class triangle extends Shape {

    double base;
    double height;

    triangle(double b, double h) {
        this.base = b;
        this.height = h;
    }

    void calculateArea() {
        System.out.println("Area of Triangle: " + (0.5 * base * height));
    }

}

class Square extends Shape {

    double side;

    Square(double side) {
        this.side = side;
    }

    void calculateArea() {
        System.out.println("Area of Square: " + (side * side));
    }
}

class circle extends Shape {

    double radius;

    circle(double r) {
        this.radius = r;
    }

    void calculateArea() {
        System.out.println("Area of circle: " + (Math.PI * radius * radius));
    }
}

public class Q5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of square: ");
        double Side = sc.nextDouble();
        Shape square = new Square(Side);
        square.calculateArea();

        System.out.print("Enter base of triangle: ");
        double Base = sc.nextDouble();
        System.out.print("Enter height of triangle: ");
        double Height = sc.nextDouble();
        Shape triangle = new triangle(Base, Height);
        triangle.calculateArea();

        System.out.print("Enter radius of circle: ");
        double Radius = sc.nextDouble();
        Shape circle = new circle(Radius);
        circle.calculateArea();

    }
}
