package FIRSTSEM.FIRSTASSIGNMENT.FIVEASSIGNMENT;
import java.util.Scanner;
public class Series {

        public static double calculateSine(double x) {
            double term = x, sum = x;
            int i = 1;

            while (Math.abs(term) > 1e-6) {
                term *= -x * x / ((2 * i) * (2 * i + 1));
                sum += term;
                i++;
            }

            return sum;
        }


        public static double calculateCosine(double x) {
            double term = 1, sum = 1;
            int i = 1;

            while (Math.abs(term) > 1e-6) {
                term *= -x * x / ((2 * i - 1) * (2 * i));
                sum += term;
                i++;
            }

            return sum;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the angle in radians: ");
            double x = scanner.nextDouble();

            double sinValue = calculateSine(x);
            double cosValue = calculateCosine(x);

            System.out.println(sinValue);
            System.out.println(cosValue);
        }
    }
