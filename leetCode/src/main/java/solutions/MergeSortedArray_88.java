package solutions;

/**
 * @Author weike
 * @Date 2022/4/23 20:48
 * @ClassName MergeSortedArray_88
 * @Link https://leetcode.com/problems/merge-sorted-array/
 * @Analysis 就是归并排序
 */
public class MergeSortedArray_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, index = m + n - 1;
        while (i >= 0 || j >= 0) {
            if (i < 0) {
                nums1[index] = nums2[j];
                j--;
                index--;
            } else if (j < 0) {
                nums1[index] = nums1[i];
                i--;
                index--;
            } else if (nums1[i] < nums2[j]) {
                nums1[index] = nums2[j];
                j--;
                index--;
            } else {
                nums1[index] = nums1[i];
                i--;
                index--;
            }
        }
    }
}