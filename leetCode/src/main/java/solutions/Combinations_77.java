package solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author weike
 * @Date 2022/5/14 14:37
 * @ClassName Combinations
 * @Link
 * @Analysis
 */
public class Combinations_77 {
    List<List<Integer>> res;

    private void generateCombination(int n, int k, int start, List<Integer> cmb) {
        //剪枝
        if (n - start + 1 + cmb.size() < k) {
            return;
        }
        //递归到底，是按照cmb的size
        if (cmb.size() == k) {
            res.add(new ArrayList<>(cmb));
        }
        //从start开始
        //包含n
        for (int i = start; i <= n; i ++) {
            cmb.add(i);
            // 是从i的下一个开始
            generateCombination(n, k , i + 1, cmb);
            cmb.remove(cmb.size() - 1);
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        if (n < 1 || k < 1 || n < k) {
            return Collections.emptyList();
        }

        res = new ArrayList<>();
        List<Integer> cmb = new ArrayList<>();
        generateCombination(n, k, 1, cmb);
        return res;
    }
}