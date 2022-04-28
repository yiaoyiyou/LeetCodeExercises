package solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author weike
 * @Date 2022/4/28 9:23
 * @ClassName IntersectionofTwoArraysII_350
 * @Link
 * @Analysis
 */
public class IntersectionofTwoArraysII_350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nums1Map = new HashMap<>();
        for (int ele : nums1) {
            if (nums1Map.containsKey(ele)) {
                nums1Map.put(ele, nums1Map.get(ele) + 1);
            } else {
                nums1Map.put(ele, 1);
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int ele : nums2) {
            if (nums1Map.containsKey(ele) && nums1Map.get(ele) > 0) {
                res.add(ele);
                nums1Map.put(ele, nums1Map.get(ele) - 1);
            }
        }

//        return res.stream().mapToInt(Integer::valueOf).toArray();
        return res.stream().mapToInt(Integer::intValue).toArray();

    }
}