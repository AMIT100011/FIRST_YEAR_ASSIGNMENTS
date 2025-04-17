public class Q17 {

    static void partition(int[] arr, int first, int last, int k) {
        // Base condition
        if (first >= last) {
            return;
        }

        // Swap if left is greater than k and right is less than or equal to k
        if (arr[first] > k && arr[last] <= k) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            partition(arr, first + 1, last - 1, k);
        }

        // Move left pointer if value is <= k
        if (arr[first] <= k) {
             partition(arr, first + 1, last, k);
        }

        // Move right pointer if value is > k
       partition(arr, first, last - 1, k);
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 9, 8, 5, 6};
        int k = 4;

       partition(arr, 0, arr.length - 1, k);

        System.out.println("Partitioned array around k = " + k + ":");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
