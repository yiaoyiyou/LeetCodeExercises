package solutions;

/**
 * @Author weike
 * @Date 2022/4/26 22:37
 * @ClassName MinimumSizeSubarraySum_209
 * @Link
 * @Analysis
 */
public class MinimumSizeSubarraySum_209 {
    public int minSubArrayLen(int target, int[] nums) {
        int res = nums.length + 1;
        //滑动窗口[i, j]
        int i = 0, j = 0;
        //j=0,先包含了一个元素，但没累加，为了和while逻辑保持一致
        int currentSum = 0;
        while (j < nums.length) {
            currentSum += nums[j];
            if (currentSum >= target) {
                while (i < j && currentSum - nums[i] >= target) {
                    currentSum -= nums[i];
                    i++;
                }
                res = Math.min(res, (j - i + 1));
            }
            j++;
        }
        if (res == nums.length + 1) {
            return 0;
        } else {
            return res;
        }

    }

    public int minSubArrayLenV1(int target, int[] nums) {
        int res = nums.length + 1;
        //滑动窗口[i, j]
        int i = 0, j = -1;
        int sum = 0;
        while (i < nums.length) {
            if (sum < target && j + 1 < nums.length) {
                sum += nums[++j];
            } else {
                sum -= nums[i++];
            }
            if (sum >= target) {
                res = Math.min(res, j - i + 1);
            }
        }
        if (res == nums.length + 1) {
            return 0;
        } else {
            return res;
        }
    }
}