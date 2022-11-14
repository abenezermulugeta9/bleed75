import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {3, 2, 4}; 
        int target = 6; 
        int[] res = getIndices(nums, target);
        System.out.println(res[0] + " " + res[1]);
    }

    public static int[] getIndices(int[] nums, int target) {
        Map<Integer, Integer> indices = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(indices.containsKey(complement)){
                return new int[]{i, indices.get(complement)};
            }else {
                indices.put(nums[i], i);
            }
        }
        return null;
    }
}
