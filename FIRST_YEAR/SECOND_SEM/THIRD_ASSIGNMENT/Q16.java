
public class Q16 {//palindrome

  static boolean palindrome(String s) {
    if (s == null) {
      return false;
    }
    if (s.length() <= 1) {
      return true;
    }
    if (s.charAt(0) != s.charAt(s.length() - 1)) {
      return false;
    }
    return palindrome(s.substring(1, s.length() - 1));

  }

  public static void main(String[] args) {
    String s = "racecar";
    System.out.println(palindrome(s));
  }
}


// public class PalindromeCheck {

//     static boolean isPalindrome(String s, int left, int right) {
//         // Base case: single character or empty string
//         if (left >= right) {
//             return true;
//         }

//         // If mismatch, not a palindrome
//         if (s.charAt(left) != s.charAt(right)) {
//             return false;
//         }

//         // Recursive call inward
//         return isPalindrome(s, left + 1, right - 1);
//     }

//     public static void main(String[] args) {
//         String input = "racecar";

//         boolean result = isPalindrome(input, 0, input.length() - 1);
//         if (result) {
//             System.out.println(input + " is a palindrome.");
//         } else {
//             System.out.println(input + " is NOT a palindrome.");
//         }
//     }
// }
