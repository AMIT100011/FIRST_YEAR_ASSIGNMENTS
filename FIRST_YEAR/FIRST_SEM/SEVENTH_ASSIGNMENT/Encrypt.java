package FIRSTSEM.FIRSTASSIGNMENT.SEVENTHASSIGNMENT;

public class Encrypt {
        public static void main(String[] args) {
            // Given letter mappings from "HOUSE" and "LEMON"
            char[] letters = {'H', 'O', 'U', 'S', 'E', 'L', 'M', 'O', 'N'};
            int[] codes =   {  3,   5,   8,   4,   2,   1,   2,   6,   5,   9};

            char[] target = {'H', 'E', 'L', 'E', 'N'}; // "HELEN"
            int[] encoded = new int[target.length];

            // Encoding process
            for (int j = 0; j < target.length; j++) {
                encoded[j] = -1; // Default to -1 if not found
                for (int i = 0; i < letters.length; i++) {
                    if (letters[i] == target[j]) {
                        encoded[j] = codes[i];
                        break;
                    }
                }
            }

            // Print encoded output manually (without StringBuilder)
            System.out.print("Encoded 'HELEN': ");
            for (int j = 0; j < encoded.length; j++) {
                if (encoded[j] == -1) {
                    System.out.print("?"); // Handle missing mappings
                } else {
                    System.out.print(encoded[j]);
                }
            }
        }
    }

