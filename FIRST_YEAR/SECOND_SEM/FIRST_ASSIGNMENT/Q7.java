package FIRSTASSIGNMENT;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the arr: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the arr:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0], min = arr[0];
        int maxCount = 0, minCount = 0;
        int maxFirstPos = 0, minLastPos = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxFirstPos = i;
                maxCount = 1;
            } else if (arr[i] == max) {
                maxCount++;
            }

            if (arr[i] < min) {
                min = arr[i];
                minLastPos = i;
                minCount = 1;
            } else if (arr[i] == min) {
                minCount++;
                minLastPos = i;
            }
        }
        System.out.println("Maximum element of array : " + max + " occurs " + maxCount);
        System.out.println("First occurrence at index: " + maxFirstPos+1);
        System.out.println("Minimum element of array : " + min + " occurs " + minCount);
        System.out.println("Last occurrence at index: " + minLastPos+1);

    }
}

