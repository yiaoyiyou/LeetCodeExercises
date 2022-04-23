public class MoveZeros_283 {
    public void moveZeroes(int[] nums) {
        int zeroNum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroNum++;
            }
        }
        if (zeroNum == 0) {
            return;
        }
        // 记录非零范围[0,j]
        int j = -1;
        for (int i = 0; i < nums.length && j < nums.length; i ++) {
            if (nums[i] != 0) {
                j ++;
                nums[j] = nums[i];
            }
        }
        for (j ++; j < nums.length; j++ ) {
            nums[j] = 0;
        }
    }
}