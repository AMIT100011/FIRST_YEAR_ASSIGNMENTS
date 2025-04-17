public class Q11 {
  static int gcd(int x, int y) {
    if(y==0)
      return x;
    return gcd(x, x % y);
  }
  public static void main(String[] args) {
System.out.println("GCD = " + gcd(48, 18));
  }
}
