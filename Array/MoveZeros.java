package Array;
import java.util.ArrayList;

public class MoveZeros {
    // approach 1: using extra space
    public void moveZeroes_old(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        int[] temp = arr.stream().mapToInt(i->(int)i).toArray();

        for (int num : nums) {
            if (num != 0)
                arr.add(num);
        }
        int i = 0;
        while (i < arr.size()) {
            nums[i] = arr.get(i);
            i += 1;
        }
        while (i < nums.length) {
            nums[i] = 0;
            i += 1;
        }
    }

    // approach 1: in place modification using two pointers
    public void moveZeroes(int[] nums) {
        int zero = 0;
        int num = 0;
        int temp;
        while (zero < nums.length && num < nums.length) {
            while (zero < nums.length && nums[zero] != 0) {
                zero += 1;
            }
            while (num < nums.length && nums[num] == 0) {
                num += 1;
            }
            if(zero<num && zero < nums.length && num < nums.length){
                temp = nums[zero];
                nums[zero] = nums[num];
                nums[num] = temp;
            }
            else{
                num+=1;
            }
        }
    }
}