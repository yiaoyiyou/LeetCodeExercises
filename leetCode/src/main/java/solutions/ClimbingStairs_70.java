package solutions;

/**
 * @Author weike
 * @Date 2022/5/14 17:20
 * @ClassName ClimbingStairs_70
 * @Link
 * @Analysis
 */
public class ClimbingStairs_70 {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int tmp1 = 1, tmp2 = 2, res = 0;
        for (int i = 3; i <= n; i ++) {
            res = tmp1 + tmp2;
            tmp1 = tmp2;
            tmp2 = res;
        }
        return res;
    }
}