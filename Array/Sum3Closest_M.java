package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3Closest_M {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int low = 0;
        int high = nums.length - 1;
        int mid;
        int diff = Integer.MAX_VALUE;
        while (low < nums.length - 2) {
            mid = low + 1;
            high = nums.length - 1;
            while (mid < high) {
                int temp = nums[low] + nums[mid] + nums[high];
                if (Math.abs(temp-target)==0) {
                    return temp;
                }
                else{
                    if(Math.abs(temp-target)<Math.abs(diff))
                        diff = target-temp;
                } 
                if (temp > target)
                    high -= 1;
                else
                    mid += 1;
            }
            low += 1;
        }
        return target-diff;
    }
}