package Linear_Search;

public class DSA_LSA_03 {
    public static int firstOccurance (int[] arr, int x){
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {10,22,34,90,65,4,10};
        int x = 34;

        System.out.println("first occurance is find " + firstOccurance(nums, x));
    }
}
