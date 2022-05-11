package solutions;

/**
 * @Author weike
 * @Date 2022/5/12 0:36
 * @ClassName PathSum_112
 * @Link
 * @Analysis
 */
public class PathSum_112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }
        return hasPathSum(root.left, targetSum - root.val) ||
                hasPathSum(root.right, targetSum - root.val);
    }
}