import java.util.Arrays;

public class DSA_Arrays05 {
    public int removeDuplicates(int[] nums){
        if(nums.length == 0){
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        DSA_Arrays05 sol = new DSA_Arrays05();
        int[] nums = {0,0,1,1,1,2,2,2,3,3,3,4};
        int newLength = sol.removeDuplicates(nums);
        System.out.println("new length: " + newLength);
        System.out.println("Arrays after removing duplicates: " + Arrays.toString(Arrays.copyOf(nums,newLength)));
    }
}
