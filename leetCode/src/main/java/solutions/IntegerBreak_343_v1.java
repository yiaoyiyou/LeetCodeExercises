package solutions;

import java.util.Arrays;

/**
 * @Author weike
 * @Date 2022/5/14 22:47
 * @ClassName IntegerBreak_343
 * @Link
 * @Analysis
 */
public class IntegerBreak_343_v1 {
    public int integerBreak(int n) {
        if (n < 2) {
            throw new IllegalArgumentException("n invalid");
        }
        int[] memo;
        memo = new int[n + 1];
        Arrays.fill(memo, -1);

        for (int i = 2; i <= n; i ++) {
            for (int j = 1; j < i; j++) {
                memo[i] = Math.max(Math.max(memo[i], j * (i - j)), j * memo[i - j]);
            }
        }

        return memo[n];
    }
}