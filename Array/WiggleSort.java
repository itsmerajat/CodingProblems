package Array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class WiggleSort {
    public void wiggleSort(int[] nums) {
        int[] arr = IntStream.of(nums).sorted().toArray();
        int i = 0;
        while(i<nums.length/2){
            // nums[2*i] = arr[i];
            // nums[2*i+1] = arr[nums.length-i-1];
            // i+=1;
            nums[2*i] = arr[nums.length/2-i-1];
            nums[2*i+1] = arr[nums.length-i-1];
            i+=1;
        }
    } // 1 1 2 2 3 3 
      // 1 3 1 3 2 2
      // 2 3 1 3 1 2
      // 1 1 1 4 5 6
      // 1 1 2 3 3
      // 2 3 1 3 1
}
