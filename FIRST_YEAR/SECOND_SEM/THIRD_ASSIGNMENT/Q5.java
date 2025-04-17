public class Q5 {
    public static < E > void printArray( E[] arr){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,8};
        String[] arr2 = {"Hello", "World", "Java"};
        Double[] arr3 = {1.1, 2.2, 3.3};
            printArray(arr);
        System.out.println();
            printArray(arr2);
        System.out.println();
            printArray(arr3);
    }
  
}
