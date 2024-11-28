import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mapper = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            mapper.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            if(mapper.containsKey(target-nums[i]) && i!=mapper.get(target-nums[i])){
                return new int[]{i,mapper.get(target-nums[i])};
            }
        }
        return new int[]{0,1};
    
    }
}