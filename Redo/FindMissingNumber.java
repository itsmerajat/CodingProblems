package Redo;
// package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindMissingNumber {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        
        
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if(nums[Math.abs(nums[i])-1]>0)
                nums[Math.abs(nums[i])-1] = -nums[Math.abs(nums[i])-1];
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>0)
                ans.add(i+1);
        }
        return ans;
    }

    public static void main(String[] args) {
        findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1});
    }
}
