package Redo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3_M {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int low = 0;
        int high = nums.length - 1;
        int mid;
        while (low < nums.length - 2) {
            if(low>0 && nums[low]==nums[low-1]){
                low+=1;
                continue;
            }
            mid = low + 1;
            high = nums.length - 1;
            while (mid < high) {
                int temp = nums[low] + nums[mid] + nums[high];
                if (temp == 0) {
                    ans.add(Arrays.asList(
                            nums[low],
                            nums[mid],
                            nums[high]));
                    while (mid < high && nums[high] == nums[high - 1])
                        high -= 1;
                    while (mid < high && nums[mid] == nums[mid + 1])
                        mid += 1;
                    mid += 1;
                    high -= 1;
                } else if (temp > 0)
                    high -= 1;
                else
                    mid += 1;
            }
            low += 1;
        }
        return ans;
    }
}