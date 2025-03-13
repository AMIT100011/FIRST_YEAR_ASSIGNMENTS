package FIRSTASSIGNMENT;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = {'c','a','r','b','o','n'};
        int n = arr.length;
        for (int i = 0; i < n  ; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n ; k++) {
                    for (int l = 0; l < n; l++) {
                        for (int m = 0; m < n ; m++) {
                            for (int o = 0; o < n ; o++) {
                                if(i!=j && i!=k &&i!=l && i!=m &&i!=o &&j!=k &&j!=l &&j!=m &&j!=o &&k!=l &&k!=m &&k!=o &&l!=m &&l!=o &&m!=o ){
                                    System.out.println(" " + arr[i] + arr[j] + arr[k] + arr[l] + arr[m] + arr[o]);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
