package solutions;


/**
 * @Author weike
 * @Date 2022/5/14 15:50
 * @ClassName WordSearch_79
 * @Link
 * @Analysis
 */
public class WordSearch_79 {
    //辅助数据结构
    int m,n;
    int[][] direct = new int[][]{{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
    boolean[][] visited;

    public boolean exist(char[][] board, String word) {
        if (board == null || word == null || word.length() == 0) {
            throw new IllegalArgumentException("illegal argumet");
        }
        m = board.length;
        assert(m > 0);
        n = board[0].length;
        visited = new boolean[m][n];
        //遍历每个位置，作为开始
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (searchWord(board, word, 0, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean searchWord(char[][] board, String word, int index, int i , int j) {
        //递归回溯到底处理
        if (index == word.length() - 1) {
            //i j的合法，由上层回溯保证
            return board[i][j] == word.charAt(index);
        }
        //处理递归过程,只有当前字符相等，才有回溯价值
        if (board[i][j] == word.charAt(index)) {
            //当前节点已经被回溯
            visited[i][j] = true;
            //以本节点为大本营，继续四面出击
            for (int k = 0; k < 4; k++) {
                int new_x = i + direct[k][0];
                int new_y = j + direct[k][1];
                //新方向合法，且未被访问过
                if (validPos(new_x, new_y) && !visited[new_x][new_y] && searchWord(board, word, index + 1, new_x, new_y)) {
                    return true;
                }
            }
            //标志该结点为未访问过
            visited[i][j] = false;
        }
        return false;
    }

    private boolean validPos(int x, int y) {
        return x >= 0 && x < m && y >= 0 && y < n;
    }


}