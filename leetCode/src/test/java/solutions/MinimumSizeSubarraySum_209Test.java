package solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumSizeSubarraySum_209Test {

    @Test
    void minSubArrayLen() {
        MinimumSizeSubarraySum_209 minimumSizeSubarraySum_209 = new MinimumSizeSubarraySum_209();
        int[] arr = new int[]{2,3,1,2,4,3};
        minimumSizeSubarraySum_209.minSubArrayLen(7, arr);
    }
}