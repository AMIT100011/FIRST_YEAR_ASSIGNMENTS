public class RearrangeArray {

    // Recursive function to rearrange elements
    public static void rearrange(int[] A, int k, int start, int end) {
        // Base case: when pointers cross
        if (start >= end) {
            return;
        }

        if (A[start] <= k) {
            // Element at start is in correct place
            rearrange(A, k, start + 1, end);
        } else if (A[end] > k) {
            // Element at end is in correct place
            rearrange(A, k, start, end - 1);
        } else {
            // Swap A[start] and A[end]
            int temp = A[start];
            A[start] = A[end];
            A[end] = temp;

            // Continue recursion
            rearrange(A, k, start + 1, end - 1);
        }
    }

    // Utility function to print the array
    public static void printArray(int[] A) {
        for (int num : A) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Driver method
    public static void main(String[] args) {
        int[] A = {12, 3, 5, 8, 10, 2, 15, 6};
        int k = 6;

        System.out.println("Original array:");
        printArray(A);

        rearrange(A, k, 0, A.length - 1);

        System.out.println("Rearranged array:");
        printArray(A);
    }
}
