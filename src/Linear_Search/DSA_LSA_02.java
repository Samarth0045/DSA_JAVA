package Linear_Search;

public class DSA_LSA_02 {
    public static int find(int[] arr, int target){

        if (arr.length == 0){
            System.out.println("Arrays is empty.");
            return -1;
        }
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                System.out.println("Found target " + target + " at index " + i);
                return i;
            }
        }
        System.out.println("Target " + target + " Not found.");
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {10,15,25,50,99,2,1,0,66};
        int target = 25;

        System.out.println("Result (index): " + find(nums,target));
    }
}
