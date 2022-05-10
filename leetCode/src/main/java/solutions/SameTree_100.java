package solutions;

/**
 * @Author weike
 * @Date 2022/5/10 23:53
 * @ClassName SameTree_100
 * @Link
 * @Analysis
 */
public class SameTree_100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}