package Linear_Search;

// implement linear search in java
public class DSA_LSA_01 {
    public static int find(int[] arr, int target){
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {10,20,55,3,22,70};
        int target = 3;

        System.out.println(find(nums,target));
    }
}
