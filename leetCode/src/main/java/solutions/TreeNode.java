package solutions;

/**
 * @Author weike
 * @Date 2022/5/10 23:37
 * @ClassName TreeNode
 * @Link
 * @Analysis
 */

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
