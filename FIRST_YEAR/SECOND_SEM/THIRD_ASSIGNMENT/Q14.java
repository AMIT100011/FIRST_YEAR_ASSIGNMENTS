
public class Q14 {

    static int product(int x, int y) {
        if (y == 0) {
            return 0;
        }
        if (y < 0) {
            return -product(x, -y);
        }
        return x + product(x, y - 1);

    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Product of " + a + " and " + b + " is: " + product(a, b));
    }
}
