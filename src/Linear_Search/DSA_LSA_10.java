package Linear_Search;

public class DSA_LSA_10 {
    public static boolean search2D (int[][] arr,int x){
        for (int[] row : arr){
            for (int n : row){
                if (n  == x){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [][] nums = {{2,3,4}, {2,4,5}};
        int target1 = 5;
        int target2 = 10;
        
        boolean result1 = search2D(nums,target1);
        System.out.println("searching for " + target1 + ": " + result1);
        boolean result2 = search2D(nums, target2);
        System.out.println("searching for " + target2 + ": " + result2);
    }
}
