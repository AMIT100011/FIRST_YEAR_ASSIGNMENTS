
public class Q13 {//binary convert from decimal

    static void convert(int n) {
        if (n == 0) {
            return;
        }
        System.out.print("" + n % 2);
        convert(n / 2);

    }

    public static void main(String[] args) {
        convert(31);
    }
}
