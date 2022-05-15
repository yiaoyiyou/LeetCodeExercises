package solutions;

/**
 * @Author weike
 * @Date 2022/5/15 14:38
 * @ClassName Jz55
 * @Link
 * @Analysis
 */
public class Jz55 {
    public int TreeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = TreeDepth(root.left);
        int rightDepth = TreeDepth(root.right);

        return leftDepth > rightDepth ? leftDepth + 1 : rightDepth + 1;
    }
}