package Linear_Search;

public class DSA_LSA_08 {
    public static int firstRepeating(int[] arr){
        for (int i=0; i < arr.length; i++){
            for (int j = i +1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {10,5,3,2,4,3,5,5,6};

        System.out.println(firstRepeating(nums));
    }

}
