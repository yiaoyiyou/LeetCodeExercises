package solutions;

/**
 * @Author weike
 * @Date 2022/5/15 11:37
 * @ClassName Jz47
 * @Link
 * @Analysis 棋盘最大
 */
public class Jz47 {

    int m,n;
    //dp f(i,j) = max(f(i - 1, j), f(i, j -1)) + grid(i, j);
    public int maxValue (int[][] grid) {
        // write code here
        if (grid == null) {
            throw new IllegalArgumentException("grid invalid");
        }
        m = grid.length;
        assert (m > 0);
        n = grid[0].length;
        int[][] maxValueGrid = new int[m][n];
        maxValueGrid[0][0] = grid[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int up = validPos(i - 1, j) ? maxValueGrid[i - 1][j] : 0;
                int lf = validPos(i, j - 1) ? maxValueGrid[i][j - 1] : 0;
                maxValueGrid[i][j] = Math.max(up, lf) + grid[i][j];
            }
        }
        return maxValueGrid[m - 1][n - 1];
    }

    boolean validPos(int i, int j) {
        return i >= 0 && i < m && j >= 0 && j < n;
    }
}