import java.util.HashSet;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {1, 2, 3, 4}; 
        System.out.println(containsDuplicate(nums));
    }

    private static boolean containsDuplicate(int[] nums) {
        // Optimized solution (o(n))
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) {
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }

        return false;

        // My solution (o(n^2))
        // for(int i = 0; i < nums.length; i++) {
        //     for(int j = i + 1; j < nums.length; j++) {
        //         if(nums[i] == nums[j]){
        //             return true; 
        //         }
        //     }
        // }

        // return false;
    }
}
