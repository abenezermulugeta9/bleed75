import java.io.Console;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = { 9,6,4,2,3,5,7,0,1 };
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        // My Solution
        int[] newArray = new int[nums.length + 1]; 
        Arrays.sort(nums);
        int firstValue = nums[0];  
        int actualSum = 0;
        int rangeSum = 0;
        
        for(int i = firstValue; i < newArray.length; i++) {
            newArray[i] = firstValue;
            rangeSum += newArray[i];
            firstValue++;
        }

        for(int i = 0; i < nums.length; i++) {
            actualSum += nums[i];
        }

        return rangeSum - actualSum;
    }
}
