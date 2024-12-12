package Redo;
import java.util.Arrays;

public class MaxConsecutiveOnesIII {
    public static int longestOnes(int[] nums, int k) {
        int one = 0;
        int zero = 0;
        int maxCount = 0;
        int count = 0;
        while(zero<nums.length && nums[zero]==1)
            zero+=1;
            maxCount+=1;
        int flip = k;
        while(zero<nums.length && one<nums.length){
            while(one<nums.length && nums[one]==1){
                count+=1;
                one+=1;
            }
            if(one<nums.length && nums[one]==0){
                if(flip>0){
                    flip-=1;
                    count+=1;
                    one+=1;
                }
                else{
                    maxCount = Integer.max(maxCount,count);
                    count = 0;
                    zero+=1;
                    one = zero;
                    flip=k;
                }
            }
            maxCount = Integer.max(maxCount,count);
        }
        return maxCount;
        
    }
    public static int longestOnesOptimized(int[] nums, int k) {
        
        int sum = 0;
        int i=0;
        int j=0;
        int maxSum = k;
        while(j<nums.length){
            sum+=nums[j];
            j+=1;
            int tempSum = (j-i) - sum;
            if(tempSum>k){
                sum-=nums[i];
                i+=1;
            }
            else
                maxSum = Integer.max(maxSum,j-i);
            
        }
        return maxSum;

        
    }
    public static void main(String[] args) {
        System.out.println(longestOnesOptimized(new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3));
    }
}