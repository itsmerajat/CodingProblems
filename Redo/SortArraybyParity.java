package Redo;

public class SortArraybyParity {
    public int[] sortArrayByParity(int[] nums) {
        int odd = 0;
        int even = 0;
        while(even<nums.length){
            if(nums[even]%2==1)
                even+=1;
            else{
                int temp = nums[even];
                nums[even] = nums[odd];
                nums[odd] = temp;
                even+=1;
                odd+=1;
            }
        }
        return nums;
    }
}
