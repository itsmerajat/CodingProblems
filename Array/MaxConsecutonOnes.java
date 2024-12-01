package Array;

public class MaxConsecutonOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]==1){
                nums[i] += nums[i-1];
                max = Integer.max(max, nums[i]);
            }
        }
        return max;
        
    }
}