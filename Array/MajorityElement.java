package Array;
import java.util.HashMap;

public class MajorityElement {
    // Approach 1: using  additonal storage
    public int majorityElement0(int[] nums) {
        HashMap<Integer,Integer> mapper = new HashMap<>();

        for (int i : nums) {
            int value = mapper.getOrDefault(i,0);
            mapper.put(i,value+1);
        }
        for (int key : mapper.keySet()) {
            if(mapper.get(key)>=nums.length/2){
                return key;
            }
            
        }
        return nums[0];
        
    }
    // Approach 2: without any space
    public int majorityElement(int[] nums) {
        int val = nums[0];
        int count = 0;
        int i = 1;
        while(i<nums.length){
            if(nums[i]==val){
                count+=1;
            }
            else{
                if(count>0){
                    count-=1;
                }
                else{
                    count=0;
                    val=nums[i];
                }
            }
            i+=1;
        }
        return val;
    }
}