//import java.lang.reflect.Array;
import java.util.Arrays;

public class DSA_Arrays04 {
    public void merge(int[] nums1, int m, int[] nums2, int n){
        int p1 = m - 1;
        int p2 = n - 1;
        int pMerged = m + n - 1;
        while(p2 >= 0){
            if(p1 >= 0 && nums1[p1] > nums2[p2]){
                nums1[pMerged--] = nums1[p1--];
            }
            else{
                nums1[pMerged--] = nums2[p2--];
            }
        }
    }

    public static void main(String[] args) {
        DSA_Arrays04 sol = new DSA_Arrays04();
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;

        System.out.println("Merged Arrays: " + Arrays.toString(nums1));
    }
}

