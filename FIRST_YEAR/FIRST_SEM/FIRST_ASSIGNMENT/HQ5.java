package FIRSTSEM.FIRSTASSIGNMENT;

public class HQ5 {
    public static void main(String[] args) {
        int w = 10;
        int g = 20;
        int k = 30;
        int a = 40;
//        w = w + g + k + a;
//        a = w -(g + k + a);
//        w = w -(g + k + a);
//        g = w + k + a;
//        k = g - (w +a);
//        g =  g - (w +a);
//        System.out.println(w);
//        System.out.println(g);
//        System.out.println(k);
//        System.out.println(a);
        int temp = w;
        w = g;
        g = k;
        k=a;
        a =temp;
        System.out.println(w);
          System.out.println(g);
          System.out.println(k);
          System.out.println(a);






    }
}
