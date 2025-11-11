import java.util.HashMap;

public class DSA_Arrays14 {
    public int subarraySum(int[] nums, int k){
        int count = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        for (int num : nums){
            sum += num;

            if (map.containsKey(sum - k)){
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        DSA_Arrays14 sol = new DSA_Arrays14();

        int[] nums = {1,2,3};
        int k = 3;

        int result = sol.subarraySum(nums,k);
        System.out.println("Number of subarray with sum " + k + " = " + result);
    }
}
