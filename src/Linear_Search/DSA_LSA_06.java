package Linear_Search;

public class DSA_LSA_06 {
    public static void main(String[] args) {
        int [] nums = {10,8,44,23,43,99,15};
        boolean found = false;

        for (int n : nums){
            if (n %2 == 0){
                found = true;
            }
        }

        System.out.println("Array: {10,8,44,23,43,99,15}");
        System.out.println("the array contain Even number: " + found);
    }
}
