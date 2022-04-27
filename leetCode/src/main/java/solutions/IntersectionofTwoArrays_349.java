package solutions;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author weike
 * @Date 2022/4/28 0:40
 * @ClassName IntersectionofTwoArrays_349
 * @Link
 * @Analysis
 */
public class IntersectionofTwoArrays_349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> leftSet = new HashSet<Integer>();
        for (int i = 0; i < nums1.length; i ++) {
            leftSet.add(nums1[i]);
        }

        Set<Integer> rightSet = new HashSet<Integer>();
        for (int i = 0; i < nums2.length; i ++) {
            rightSet.add(nums2[i]);
        }

        leftSet.retainAll(rightSet);
        return leftSet.stream().mapToInt(Integer::intValue).toArray();
    }
}