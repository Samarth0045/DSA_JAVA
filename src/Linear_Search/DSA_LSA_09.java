package Linear_Search;

public class DSA_LSA_09 {
    public static int firstNonRepeating(int[] arr){
        for (int i = 0; i < arr.length; i++){
            boolean repeat = false;
            for (int j = 0; j < arr.length; j++){
                if (i != j && arr[i] == arr[j]){
                    repeat = true;
                    break;
                }
            }
            if (!repeat){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {10,3,3,4,6,6,5,4};

        System.out.println(firstNonRepeating(nums));
    }
}
