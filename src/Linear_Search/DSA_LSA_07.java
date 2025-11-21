package Linear_Search;

public class DSA_LSA_07 {
    public static void main(String[] args) {
        int [] nums = {10,0,34,55,20,99};
        int min = nums[0];
        int max = nums[0];

        for (int n : nums){
            min = Math.min(min, n);
            max = Math.max(max,n);
        }

        System.out.println("Array: {10,0,34,55,20,99}");
        System.out.println("the minimum number in array is: " + min);
        System.out.println("the minimum number in array is: " + max);
    }
}
