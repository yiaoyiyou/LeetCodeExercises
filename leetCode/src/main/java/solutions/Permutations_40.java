package solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author weike
 * @Date 2022/5/14 12:00
 * @ClassName Permutations_40
 * @Link
 * @Analysis
 */
public class Permutations_40 {
    List<List<Integer>> res;

    //当前处理的数组
    //当前处理的序列
    //当前已经组装的排列
    private void generatePermute(int[] nums, int index, List<Integer> pmt) {
        //处理递归到底情况
        if (index == nums.length) {
            res.add(new ArrayList<>(pmt));
            return;
        }
        //处理递归过程
        for (int num : nums) {
            if (pmt.contains(num)) {
                continue;
            }
            //进行回溯
            pmt.add(num);
            generatePermute(nums, index + 1, pmt);
            pmt.remove(pmt.size() - 1);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        //非空判断
        if(nums.length == 0) {
            return Collections.emptyList();
        }
        //递归回溯
        res = new ArrayList<>();
        List<Integer> pmt = new ArrayList<>();
        generatePermute(nums, 0, pmt);
        return res;
    }
}