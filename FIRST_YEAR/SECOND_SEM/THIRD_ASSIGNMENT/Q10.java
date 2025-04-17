
public class Q10 {

    static int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int terms = 5;
        for (int i = 0; i < terms; i++) {
            System.out.print(Fibonacci(i) + " ");
        }
    }
}
