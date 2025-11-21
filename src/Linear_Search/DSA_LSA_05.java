package Linear_Search;

public class DSA_LSA_05 {
    public static void main(String[] args) {
        int [] nums = {10,5,20,5,10,30,5,40};
        int x = 5;

        int count = 0;
        for (int n : nums){
            if (n == x){
                count++;
            }
        }

        System.out.println("Array: {10,5,20,5,10,30,5,40}");
        System.out.println("Frequency (count): " + count);
    }
}
