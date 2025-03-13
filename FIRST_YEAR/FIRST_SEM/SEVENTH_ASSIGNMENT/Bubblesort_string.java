package FIRSTSEM.FIRSTASSIGNMENT.SEVENTHASSIGNMENT;

public class Bubblesort_string {
        public static void main(String[] args) {
            char[] arr = {'M', 'O', 'V', 'I', 'E'};
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        char temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            for (char c : arr)
                System.out.print(c);
        }
    }

