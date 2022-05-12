package solutions;

/**
 * @Author weike
 * @Date 2022/5/12 21:49
 * @ClassName SumofLeftLeaves_404
 * @Link
 * @Analysis
 */
public class SumofLeftLeaves_404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        if (root.left != null && root.left.left == null && root.left.right == null) {
            sum = root.left.val;
        }
        return sum + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }
}