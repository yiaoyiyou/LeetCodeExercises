package solutions;

import java.util.Arrays;

/**
 * @Author weike
 * @Date 2022/5/15 17:20
 * @ClassName LongestIncreasingSubsequence_300
 * @Link
 * @Analysis
 */
public class LongestIncreasingSubsequence_300 {
    public int lengthOfLIS(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("nums null");
        }
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        //dp LIS(i) 以i为结尾[0, i]范围内的结果
        //LIS(i) = max( 1 + LIS(j) if (nums[i] > num[j]))
        int[] memo = new int[n];
        //刚开始，LSI组少为1
        Arrays.fill(memo, 1);

        int res = 1;

        //求解[i, n - 1]
        for (int i = 1; i < n; i ++) {
            for(int j = 0; j < i; j ++) {
                if (nums[i] > nums[j]) {
                    memo[i] = Math.max(memo[i], memo[j] + 1);
                    if (res < memo[i]) {
                        res = memo[i];
                    }
                }
            }
        }

        return res;

    }
}