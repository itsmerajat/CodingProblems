package Array;

import java.util.HashMap;

public class RemoveDuplicateSortedArray {
    public int removeDuplicates(int[] nums) {
        int i=1;
        int j=1;
        while(j<nums.length){
            if(nums[j-1]!=nums[j]){
                nums[i]=nums[j];
                i+=1;
            }
            j+=1;
        }
        return i;
    }

    public static int removeDuplicates2(int[] nums) {

        int i=0;
        int j=0;
        int count=0;
        while(j<nums.length){
            while(j<nums.length && nums[i]==nums[j]){
                count+=1;
                j+=1;
            }
            if(count>2){
                i+=2;
                while(i<j){
                    nums[i]=Integer.MAX_VALUE;
                    i+=1;
                }
            }
            else{
                i=j;
            }
            count=0;
        }
        i=0;
        while(i<nums.length && nums[i]!=Integer.MAX_VALUE){
            i++;
        }
        j=i+1;
        int temp;
        while(j<nums.length){
            if(nums[j]!=Integer.MAX_VALUE){
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = nums[i];
                j+=1;
                i+=1;
            }
            else{
                j+=1;
            }
        }
        return i;
        
    }
    public static void main(String[] args) {
        System.out.println(removeDuplicates2(new int[]{0,0,1,1,1,1,2,3,3}));
    }
}

