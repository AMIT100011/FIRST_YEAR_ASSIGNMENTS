
public class Q12 {

    static int binarysearch(int[] arr, int low, int high, int key) {
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (arr[mid] == key) {
            return mid;
        }
        if (arr[mid] > key) {   
            return binarysearch(arr, low, mid - 1, key);
        }

        return binarysearch(arr, mid + 1, high, key);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 8, 10, 16};
        int key = 10;
        int result = binarysearch(arr, 0, arr.length - 1, key);
        if (result != -1) {
            System.out.println("THE ELEMENT IS AT INDEX = " + result);
        } else {
            System.out.println("ELEMENT NOT FOUND");
        }
    }
}
