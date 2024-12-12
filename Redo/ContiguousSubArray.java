package Redo;

import java.util.HashMap;

public class ContiguousSubArray {
    public static boolean checkSubarraySum(int[] nums, int k) {
        for(int m=0;m<nums.length;m++){
            nums[m]=nums[m]%k;
        }
        HashMap<Integer,Integer> mapper = new HashMap<>();
        mapper.put(0,-1);
        int prefix = 0;
        for(int i=0;i<nums.length;i++){
            prefix = (prefix + nums[i])%k;
            if(mapper.containsKey(k-prefix)){
                if(i-mapper.get(k-prefix)>1){
                    return true;
                }
            }
            else
                mapper.put(prefix,i);
        }
        return false;
    }
    public static void main(String[] args) {
        checkSubarraySum(new int[]{23,2,4,6,7}, 6);
    }
}