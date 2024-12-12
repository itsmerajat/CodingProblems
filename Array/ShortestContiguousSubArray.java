package Array;

public class ShortestContiguousSubArray {
    public static int findUnsortedSubarray(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right && nums[left] <= nums[left + 1])
            left += 1;
        while (left < right && nums[right] >= nums[right - 1])
            right -= 1;
        System.out.println(left + " " + right);
        if(right==left){
            return 0;
        }
        // left = 3 right = 4
        int smallest = nums[left]; //3
        int highest = nums[left]; //6
        for(int i=left;i<=right;i++){
            if(nums[i]<smallest)
                smallest = nums[i];
            if(nums[i]>highest)
                highest = nums[i];
        }
        int templeft = left; //templeft = 0, left = 2
        while(templeft>=0){
            if(nums[templeft]>smallest){ //nums[templeft] = 3 smallest = 3
                left = templeft;
            }
            templeft-=1;
        }
        int tempright = right; //tempright = 6, right = 4
        while(tempright<nums.length){
            if(nums[tempright]<highest){ //nums[tempright] = 8 highest = 6
                right = tempright;
            }
            tempright+=1;
        }
        return right-left+1;
    }
    public static void main(String[] args) {
        System.out.println(findUnsortedSubarray(new int[]{9,7,6,5,4,5,6}));
    }
}