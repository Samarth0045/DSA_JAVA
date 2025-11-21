import java.util.Arrays;

public class DSA_Arrays09 {
    public static  int[] productExceptself(int[] nums){
        int n = nums.length;
        int[] result = new int[n];

        int prefix = 1;
        for (int i = 0; i < n; i++){
            result[i] = prefix;
            prefix *= nums[i];
        }
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--){
            result[i] *= suffix;
            suffix *= nums[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1,22,3,4};
        int[] output = productExceptself(nums);
        System.out.println("Product Except Self: " + Arrays.toString(output));
    }
}
