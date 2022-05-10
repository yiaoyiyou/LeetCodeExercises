package solutions;

/**
 * @Author weike
 * @Date 2022/5/10 23:35
 * @ClassName MaximumDepthofBinaryTree_104
 * @Link
 * @Analysis
 */
public class MaximumDepthofBinaryTree_104 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}