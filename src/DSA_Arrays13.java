public class DSA_Arrays13 {
    public int maxArea(int[] height){
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int currentHeight = Math.min(height[left], height[right]);
            int width = right - left;
            int currentArea = currentHeight * width;
            maxArea = Math.max(maxArea, currentArea);

            if (height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        DSA_Arrays13 sol = new DSA_Arrays13();
        int[] height = {1,8,6,2,5,4,8,3,7};
        int result = sol.maxArea(height);
        System.out.println("maximum water area: " + result);
    }
}
