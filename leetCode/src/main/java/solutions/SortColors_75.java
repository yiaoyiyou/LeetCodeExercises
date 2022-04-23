package solutions;

/**
 * @Author weike
 * @Date 2022/4/23 19:33
 * @ClassName SortColors_75
 * @Link https://leetcode.com/problems/sort-colors/
 * @Analysis 三路快排
 */
public class SortColors_75 {
    public void sortColors(int[] nums) {
        //[0, i] 0
        //[i + 1, j) 1
        //[j, index) 2
        int i = -1, j = 0;
        for (int num : nums) {
            if (num == 0) {
                i++;
                j++;
            } else if (num == 1) {
                j++;
            }
        }
        for (int k = 0; k <= i; k ++) {
            nums[k] = 0;
        }
        for (int k = i + 1; k < j; k ++) {
            nums[j] = 1;
        }
        for (int k = j; k <= nums.length; k ++) {
            nums[k] = 2;
        }

    }
}