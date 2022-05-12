package solutions;

/**
 * @Author weike
 * @Date 2022/5/12 23:08
 * @ClassName PathSumIII_437
 * @Link
 * @Analysis
 */
public class PathSumIII_437 {
    public int pathSum(TreeNode root, int targetSum) {
        //处理递归终止：非空判断
        if (root == null) {
            return 0;
        }
        int sum = 0;
        //包含当前节点的路径
        sum += findPath(root, targetSum);
        //不包含当前节点的路径
        sum += pathSum(root.left, targetSum);
        sum += pathSum(root.right, targetSum);
        return sum;

    }
    //包括当前节点的路径，切和为t
    private int findPath(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }
        int res = 0;
        if (root.val == targetSum) {
            res ++;
        }
        res += findPath(root.left, targetSum - root.val);
        res += findPath(root.right, targetSum - root.val);
        return res;
    }
}