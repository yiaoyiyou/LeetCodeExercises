package solutions;

/**
 * @Author weike
 * @Date 2022/5/15 16:35
 * @ClassName HouseRobber_198_recursion
 * @Link https://leetcode.com/problems/house-robber/
 * @Analysis
 */
public class HouseRobber_198_recursion {
    public int rob(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("nums null");
        }
        //调用递归函数
        return tryRob(nums, 0);
    }
    //rob [i, nums.size() - 1]
    private int tryRob(int[] nums, int index) {
        //处理递归到底
        if (index >= nums.length) {
            return 0;
        }

        //分别去尝试下抢劫[i, nums.size() - 1]的，并找到最大值
        //应该初始化为0，而不是-1
        int res = 0;
        for (int i = index; i < nums.length; i++) {
            //找出最大值
            res = Math.max(res, nums[i] + tryRob(nums, i + 2));
        }
        return res;
    }
}