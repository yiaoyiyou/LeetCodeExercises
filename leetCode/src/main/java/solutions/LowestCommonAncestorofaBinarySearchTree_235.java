package solutions;

/**
 * @Author weike
 * @Date 2022/5/12 23:31
 * @ClassName LowestCommonAncestorofaBinarySearchTree_235
 * @Link
 * @Analysis
 */
public class LowestCommonAncestorofaBinarySearchTree_235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //终止条件，非空判断
        if (root == null) {
            return null;
        }
        //利用搜索树特性
        if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        }
        if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }
}