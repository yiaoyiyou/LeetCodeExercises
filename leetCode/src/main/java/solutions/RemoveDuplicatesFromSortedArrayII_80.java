package solutions;

/**
 * @Author weike
 * @Date 2022/4/23 18:01
 * @ClassName RemoveDuplicatesFromSortedArrayII_80
 * @Link
 * @Analysis
 */
public class RemoveDuplicatesFromSortedArrayII_80 {
    public int removeDuplicates(int[] nums) {
        //[0, i]已经处理好的
        //[i + 1, j)是废弃的
        //[j, length)待处理
        int i = -1, j = 0;
        int length = nums.length;
        while (i < length && j < length) {
            int thisVal = nums[j];
            if (j + 1 < length && nums[j + 1] == thisVal) {
                j ++;
                nums[i + 1] = thisVal;
                nums[i + 2] = thisVal;
                i += 2;
                while (j < length && nums[j] == thisVal) {
                    j ++;
                }
            } else {
                i ++;
                nums[i] = thisVal;
                j ++;
            }
        }
        return i + 1;
    }
}