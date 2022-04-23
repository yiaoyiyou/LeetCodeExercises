package solutions;

/**
 * @Author weike
 * @Date 2022/4/23 16:45
 * @ClassName RemoveElement_23
 * @Description no
 * @Link https://leetcode.com/problems/remove-element/
 * @Analysis 仍然是快排partion。根据顺序，可用双指针完成
 */
public class RemoveElement_27 {
    public int removeElement(int[] nums, int val) {
        //[0, i] 不等于val
        //初始值，应该满足边界条件
        int i = -1, j = 0;
        while (j < nums.length) {
            if (nums[j] != val) {
                i ++;
                nums[i] = nums[j];
            }
            j ++;
        }
        return i;
    }
}