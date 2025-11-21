package Linear_Search;

public class DSA_LSA_04 {

    public static int findRecursive(int[] arr, int target, int index) {
        for (int i = 0; i < arr.length; i++) {
            if (index >= arr.length) {
                return -1;
            }

            if (arr[index] == target) {
                return index;
            }

            return findRecursive(arr, target, index + 1);
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {10,20,55,4,3,9};
        int target = 20;

        int resultindex = findRecursive(nums,target,0);

        System.out.println(resultindex);
    }
}
