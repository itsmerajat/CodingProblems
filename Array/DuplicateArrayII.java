package Array;

import java.util.HashMap;

public class DuplicateArrayII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> mapper = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if (mapper.containsKey(val)) {
                if ((Math.abs(mapper.get(val) - i)) <= k)
                    return true;
            }
            mapper.put(val, i);
        }
        return false;
    }
}
