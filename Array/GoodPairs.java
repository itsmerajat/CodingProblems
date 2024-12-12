package Array;

import java.util.HashMap;

public class GoodPairs {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> mapper = new HashMap<>();

        for(int num: nums){
            mapper.put(num,mapper.getOrDefault(num,0)+1);
        }
        int ans = 0;
        // int n = 5;   
        for(int val: mapper.values()){
            double sum = 1;
            for (int i = 1; i <= 2; i++) {
                sum = sum * (val - 2 + i) / i;
            }
            ans+=(int)sum;
        }
        return ans;
    }
}