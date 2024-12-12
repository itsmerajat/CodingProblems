package Array;

import java.util.HashMap;

public class SubArraySum {
    public static int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> prefix = new HashMap<>();
        int count=0;
        int sum=0;
        prefix.put(0,1);
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            if(prefix.containsKey(sum-k)){
                count+=prefix.get(sum-k);
                prefix.put(sum-k,prefix.get(sum-k)+1);
            }
            else{
                prefix.put(sum,1);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        subarraySum(new int[]{5,-2,6,-9,3,8}, 3);
    }
}

