/**
 * @Author weike
 * @Date 2022/4/23 15:48
 * @ClassName MoveZeros_283
 * @Link https://leetcode.com/problems/move-zeroes/
 */
public class MoveZeros_283 {
    public void moveZeroes(int[] nums) {
        // 记录非零范围[0,j]
        int j = -1;
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] != 0) {
                j ++;
                nums[j] = nums[i];
            }
        }
        for (j ++; j < nums.length; j++ ) {
            nums[j] = 0;
        }
    }
}