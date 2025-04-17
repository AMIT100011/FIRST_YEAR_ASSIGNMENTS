public class Q6 {
    public static <T> int count(T[] array, T item){
        int c = 0;
        for(int i = 0;i < array.length;i++){
            if(array[i] == item )
                c++;
        }
        return c;
    }
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 2, 4, 2};
        String[] sarr = {"apple", "banana", "apple", "orange"};
        System.out.println(count(arr,2));
        System.out.println(count(sarr,"apple"));
    }
  
}
