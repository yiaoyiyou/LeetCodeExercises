package solutions;

/**
 * @Author weike
 * @Date 2022/5/15 16:35
 * @ClassName HouseRobber_198_recursion
 * @Link https://leetcode.com/problems/house-robber/
 * @Analysis
 */
public class HouseRobber_198_dp {
    int[] memo;
    public int rob(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("nums null");
        }
        int length = nums.length;
        if (length == 0) {
            return 0;
        }
        //dp for index[length - 1, 0], f([index, length -1])的
        int[] memo = new int[length + 2];
        //初识问题结果灌入[n - 1, n - 1]
        memo[length - 1] = nums[length - 1];
        for (int i = length - 2; i >= 0; i --) {
            for (int j = i; j < length; j ++) {
                memo[i] = Math.max(memo[i], nums[j] +memo[j+2]);
            }
        }
        return memo[0];
    }
}