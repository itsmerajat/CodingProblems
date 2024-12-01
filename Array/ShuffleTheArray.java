package Array;

public class ShuffleTheArray{
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int i=0;
        while(i<n){
            arr[2*i] = nums[i];
            arr[2*i+1] = nums[i+n];
            i+=1;
        }
        return arr;
    }
}
