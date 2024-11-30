package Array;

import java.util.Arrays;

public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int leftsum = 0;
        int rightsum = Arrays.stream(nums).sum();
        int i = 0;
        while(i<nums.length){
            rightsum-=nums[i];
            if(leftsum==rightsum){
                return i;
            }
            leftsum+=nums[i];
            i+=1;
        }
        return -1;
        
    }
}