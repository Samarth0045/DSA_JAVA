import java.util.HashSet;
import java.util.Scanner;

public class DSA_Arrays02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        DSA_Arrays02 obj = new DSA_Arrays02();
        boolean hasDuplicate = obj.containsDuplicate(nums);
        if (hasDuplicate) {
            System.out.println("The array contains duplicates.");
            obj.printDuplicates(nums);
        } else {
            System.out.println("The array does not contain duplicates.");
        }
        sc.close();
    }
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
    public void printDuplicates(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                duplicates.add(num);
            } else {
                seen.add(num);
            }
        }
        System.out.println("Duplicate elements:");
        for (int dup : duplicates) {
            System.out.println(dup);
        }
    }
}

