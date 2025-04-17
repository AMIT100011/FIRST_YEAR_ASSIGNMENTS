
public class Q15 {

    static String reverse(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        return s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
    }

    public static void main(String[] args) {
        String a = "pots&pans";
        String reversed = reverse(a);
        System.out.println("Original: " + a);
        System.out.println("Reversed: " + reversed);
    }
}

// public class ReverseString {
//     static void reverseHelper(char[] s, int left, int right) {
//         // Base case: pointers have met or crossed
//         if (left >= right) {
//             return;
//         }
//         // Swap characters
//         char temp = s[left];
//         s[left] = s[right];
//         s[right] = temp;
//         // Recursive call inward
//         reverseHelper(s, left + 1, right - 1);
//     }
//     static String reverse(String s) {
//         if (s == null || s.length() <= 1) {
//             return s;
//         }
//         char[] charArray = s.toCharArray();
//         reverseHelper(charArray, 0, charArray.length - 1);
//         return new String(charArray);
//     }
//     public static void main(String[] args) {
//         String input = "pots&pans";
//         String reversed = reverse(input);
//         System.out.println("Original: " + input);
//         System.out.println("Reversed: " + reversed);
//     }
// }
