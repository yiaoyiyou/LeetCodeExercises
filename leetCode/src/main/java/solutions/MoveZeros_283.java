package solutions;

import utils.ArrayHelpers;

/**
 * @Author weike
 * @Date 2022/4/23 15:48
 * @ClassName solutions.MoveZeros_283
 * @Link https://leetcode.com/problems/move-zeroes/
 * @Analysis 实际就是快排的一次partion
 */
public class MoveZeros_283 {
    public void moveZeroes(int[] nums) {
        // 记录非零范围[0,j]
        int j = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                j++;
                nums[j] = nums[i];
            }
        }
        for (j++; j < nums.length; j++) {
            nums[j] = 0;
        }
    }

    public void moveZerosV1(int[] nums) {
        //[0, i] 非0区间
        //[i + 1, j) 0
        int i = -1, j = 0;
        while (j < nums.length) {
            if (nums[j] != 0) {
                i ++;
                //优化：只有在不等的时候才需要交换
                if (i != j) {
                    ArrayHelpers.swapInt(nums, i, j);
                }
            }
            j ++;
        }
    }
}