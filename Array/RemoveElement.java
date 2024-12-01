package Array;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int start=0;
        int end = nums.length-1;
        while(start<=end){
            if(nums[start]==val){
                int temp = nums[start];
                nums[start]=nums[end];
                nums[end] = nums[start];
                end-=1;
            }
            else{
                start+=1;
            }
        }
        return start;
    }
}