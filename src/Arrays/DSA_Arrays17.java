public class DSA_Arrays17 {
    public int trap(int[] height){
        int left = 0,right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int trappedwater = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    trappedwater += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    trappedwater += rightMax - height[right];
                }
                right--;
            }
        }
        return trappedwater;
    }
    public static void main(String[] args) {
        DSA_Arrays17 sol = new DSA_Arrays17();

        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("total trapped water: " + sol.trap(height));
    }
}
