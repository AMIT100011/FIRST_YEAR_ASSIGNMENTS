
public class Q8 {

    static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * (int) Math.pow(x, n - 1);

    }

    public static void main(String[] args) {
        System.out.println(power(2, 4));
    }
}
