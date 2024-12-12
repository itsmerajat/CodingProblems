package Redo;

import java.util.Arrays;

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length];
        int[] post = new int[nums.length];

        pre[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            pre[i] = pre[i - 1] * nums[i];
        }

        post[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            post[i] = post[i + 1] * nums[i];
        }
        System.out.println(Arrays.toString(pre));
        System.out.println(Arrays.toString(post));
        int i = 1;
        nums[0] = post[1];
        nums[nums.length - 1] = pre[nums.length - 2];
        while (i < nums.length - 1) {
            nums[i] = pre[i - 1] * post[i + 1];
            i += 1;
        }
        return nums;
    }
}
