package Array;

public class SortColors {
    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            while (right > 0 && nums[right] == 2) {
                right -= 1;
            }
            if (nums[left] == 2) {
                swap(nums, left, right);
                right -= 1;
            } else {
                left += 1;
            }
        }
        left = 0;
        while (left < right) {
            while (right > 0 && nums[right] == 1) {
                right -= 1;
            }
            if (nums[left] == 1) {
                swap(nums, left, right);
                right -= 1;
            } else {
                left += 1;
            }
        }
    }

    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}