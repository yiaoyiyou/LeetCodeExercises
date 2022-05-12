package solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author weike
 * @Date 2022/5/12 22:31
 * @ClassName BinaryTreePaths_257
 * @Link
 * @Analysis
 */
public class BinaryTreePaths_257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        //终止条件1：非空判断
        if (root == null) {
            return res;
        }
        //终止条件2: 递归到底。也可以认为是递归处理过程的一环
        if (root.left == null && root.right == null) {
            res.add(String.valueOf(root.val));
            return res;
        }
        //处理过程：处理左子树
        List<String> leftRes = binaryTreePaths(root.left);
        for (int i = 0; i < leftRes.size(); i++) {
            res.add(String.valueOf(root.val) + "->" + String.valueOf(leftRes.get(i)));
        }
        //处理过程：处理右子树
        List<String> rightRes = binaryTreePaths(root.right);
        for (int i = 0; i < rightRes.size(); i++) {
            res.add(String.valueOf(root.val) + "->" + String.valueOf(rightRes.get(i)));
        }
        return res;

    }
}