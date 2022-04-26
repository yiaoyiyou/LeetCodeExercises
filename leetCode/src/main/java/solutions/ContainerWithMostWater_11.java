package solutions;

/**
 * @Author weike
 * @Date 2022/4/26 9:05
 * @ClassName ContainerWithMostWater_11
 * @Link https://leetcode.com/problems/container-with-most-water/
 * @Analysis 双指针法
 */
public class ContainerWithMostWater_11 {
    public int maxArea(int[] height) {
        int max = 0;
        int i = 0, j = height.length - 1;
        while (i < j) {
            if (height[i] > height[j]) {
                int current = height[j] * (j - i);
                if (max < current) {
                    max = current;
                }
                j --;
            } else {
                int current = height[i] * (j - i);
                if (max < current) {
                    max = current;
                }
                i ++;
            }
        }
        return max;
    }
}