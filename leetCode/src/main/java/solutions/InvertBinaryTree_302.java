package solutions;

/**
 * @Author weike
 * @Date 2022/5/10 23:45
 * @ClassName InvertBinaryTree_302
 * @Link
 * @Analysis
 */
public class InvertBinaryTree_302 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        invertTree(root.left);
        invertTree(root.right);
        TreeNode swap = root.left;
        root.left = root.right;
        root.right = swap;
        return root;
    }
}