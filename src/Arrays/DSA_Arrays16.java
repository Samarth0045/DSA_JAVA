public class DSA_Arrays16 {
    public boolean canJump(int[] nums){
        int reachable = 0;

        for (int i = 0; i < nums.length; i++){
            if (i > reachable)
                return false;
            reachable = Math.max(reachable, i + nums[i]);
        }
        return true;
    }
    public static void main(String[] args) {
        DSA_Arrays16 sol = new DSA_Arrays16();

        int[] nums1 = {2,3,1,1,4};
        int[] nums2 = {3,2,1,0,4};

        System.out.println(sol.canJump(nums1));
        System.out.println(sol.canJump(nums2));
    }
}
