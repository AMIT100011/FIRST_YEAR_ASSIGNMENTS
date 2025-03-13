package FIRSTASSIGNMENT;
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rem=0;int c = 0;
        while(num > 2){
            c++;
            num = num/2;
        }
        System.out.println(c);
    }

}
