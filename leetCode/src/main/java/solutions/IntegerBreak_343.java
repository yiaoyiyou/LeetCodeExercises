package solutions;

import java.util.Arrays;

/**
 * @Author weike
 * @Date 2022/5/14 22:47
 * @ClassName IntegerBreak_343
 * @Link
 * @Analysis
 */
public class IntegerBreak_343 {
    int[] memo;

    private int breakInteger(int n) {
        //如果为1，则直接返回
        if (n == 1) {
            return 1;
        }
        if (memo[n] != -1) {
            return memo[n];
        }
        int res = -1;
        for (int i = 1; i < n; i++) {
            //注意，需要比较两种情况
            res = Math.max(Math.max(res, i * (n - i)), i * breakInteger(n - i));
        }
        memo[n] = res;
        return res;
    }

    public int integerBreak(int n) {
        if (n < 2) {
            throw new IllegalArgumentException("n invalid");
        }
        memo = new int[n + 1];
        Arrays.fill(memo, -1);
        return breakInteger(n);
    }
}