package solutions;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayII_80Test {

    @Test
    void removeDuplicates() {
        int nums[] = new int[] {0,0,1,1,1,1,2,3,3};
        RemoveDuplicatesFromSortedArrayII_80 removeDuplicatesFromSortedArrayII_80 = new RemoveDuplicatesFromSortedArrayII_80();
        int res = removeDuplicatesFromSortedArrayII_80.removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(res);
    }
}