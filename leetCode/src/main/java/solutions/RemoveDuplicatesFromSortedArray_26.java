package solutions;

/**
 * @Author weike
 * @Date 2022/4/23 17:27
 * @ClassName RemoveDuplicatesFromSortedArray_28
 * @Link https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * @Analysis 兄弟齐心，其利断金
 */
public class RemoveDuplicatesFromSortedArray_26 {
    public int removeDuplicates(int[] nums) {
        //双索引移动
        //[0, i] ready
        //[i + 1, j) condidate
        int i = 0, j = 1;
        while (i < nums.length && j < nums.length) {
            while (j < nums.length && nums[j] == nums[i]) {
                j ++;
            }
            if (j == nums.length) {
                break;
            } else {
                i ++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}