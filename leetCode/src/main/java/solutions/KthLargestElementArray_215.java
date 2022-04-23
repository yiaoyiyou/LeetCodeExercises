package solutions;

/**
 * @Author weike
 * @Date 2022/4/23 21:08
 * @ClassName KthLargestElementArray_215
 * @Link https://leetcode.com/problems/kth-largest-element-in-an-array/
 * @Analysis 快排的应用
 */
public class KthLargestElementArray_215 {
    public int findKthLargest(int[] nums, int k) {
        return findKthLargest(nums, k - 1, 0, nums.length - 1);
    }

    //[start, end]区间查找，第k - 1 个数
    private int findKthLargest(int[] nums, int k, int start, int end) {
        if (start > end) {
            throw new IllegalArgumentException();
        }
        int pivot = nums[start];
        if (start == end && start == k) {
            return pivot;
        }
        //[start + 1, i] >= pivot;
        //[i + 1, j) < pivot
        int i = start, j = start + 1;
        while (j <= end) {
            if (nums[j] >= pivot) {
                int swap = nums[j];
                nums[j] = nums[i + 1];
                nums[i + 1] = swap;
                i ++;
            }
            j ++;
        }
        nums[start] = nums[i];
        nums[i] = pivot;
        if (i == k) {
            return pivot;
        } else if (i > k) {
            return findKthLargest(nums, k, start, i - 1);
        } else {
            return findKthLargest(nums, k, i + 1, end);
        }
    }
}