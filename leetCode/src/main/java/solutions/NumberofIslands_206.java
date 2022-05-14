package solutions;

/**
 * @Author weike
 * @Date 2022/5/14 16:33
 * @ClassName NumberofIslands_206
 * @Link
 * @Analysis
 */
public class NumberofIslands_206 {

    //辅助数据结构
    int m,n;
    int[][] direct = new int[][]{{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
    boolean[][] visited;

    public int numIslands(char[][] grid) {
        if (grid == null) {
            throw new IllegalArgumentException("grid null");
        }
        m = grid.length;
        assert(m > 0);
        n = grid[0].length;

        //难点是怎么组织数据，把已经标记的进行统计
        visited = new boolean[m][n];
        int res = 0;
        for (int i = 0; i < m; i ++) {
            for (int j = 0; j < n; j ++) {
                //未被标记，且为1，才是个一块陆地
                if (!visited[i][j] && grid[i][j] == '1') {
                    floodFills(grid, i, j);
                    res ++;
                }
            }
        }
        return res;

    }

    private void floodFills(char[][] grid, int i, int j) {
        //递归终止条件被融入到了非法判断中
        visited[i][j] = true;
        for (int k = 0; k < 4; k ++) {
            int newX = direct[k][0] + i;
            int newY = direct[k][1] + j;
            if (validPos(newX, newY) && !visited[newX][newY] && grid[newX][newY] == '1') {
                floodFills(grid, newX, newY);
            }
        }
    }

    private boolean validPos(int x, int y) {
        return x >= 0 && x < m && y >= 0 && y < n;
    }
}