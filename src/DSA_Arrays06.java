import java.util.Arrays;
public class DSA_Arrays06 {
    public int[] plusOne(int[] digits) {
            for (int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] < 9) {
                    digits[i]++;
                    return digits;
                }
                digits[i] = 0; // carry over
            }
            // If all digits were 9 → create new array
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            return newDigits;
        }

        public static void main(String[] args) {
            DSA_Arrays06 sol = new DSA_Arrays06();

            int[] digits1 = {1, 2, 3};   // 123 + 1 = 124
            int[] digits2 = {9, 9, 9};   // 999 + 1 = 1000
            int[] digits3 = {4, 3, 2, 1}; // 4321 + 1 = 4322

            System.out.println("Input: [1, 2, 3] → Output: " + Arrays.toString(sol.plusOne(digits1)));
            System.out.println("Input: [9, 9, 9] → Output: " + Arrays.toString(sol.plusOne(digits2)));
            System.out.println("Input: [4, 3, 2, 1] → Output: " + Arrays.toString(sol.plusOne(digits3)));
    }
}
