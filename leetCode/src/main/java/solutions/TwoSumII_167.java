package solutions;

/**
 * @Author weike
 * @Date 2022/4/24 9:00
 * @ClassName TwoSumII_167
 * @Link https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 * @Analysis 二分查找法, 双索引法
 */
public class TwoSumII_167 {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            //边界条件需要维护
            int j = binarySearch(numbers, target - numbers[i], i + 1, numbers.length - 1);
            if (j != -1) {
                res[0] = i + 1;
                res[1] = j + 1;
                return res;
            }
        }
        return res;
    }

    private int binarySearch(int[] numbers, int target, int start, int end) {
        //因为是[start, end]
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (numbers[mid] == target) {
            return mid;
        } else if (numbers[mid] > target) {
            return binarySearch(numbers, target, start, mid - 1);
        } else {
            return binarySearch(numbers, target, mid + 1, end);
        }
    }

    public int[] twoSumV1(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum == target){
                int[] res = new int[2];
                res[0] = i + 1;
                res[1] = j + 1;
                return res;
            } else if (sum > target) {
                j--;
            } else {
                i++;
            }
        }
        return new int[]{0, 0};

    }

}