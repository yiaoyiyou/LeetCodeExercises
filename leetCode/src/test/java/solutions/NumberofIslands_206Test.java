package solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberofIslands_206Test {

    @Test
    void numIslands() {
        NumberofIslands_206 numberofIslands_206 = new NumberofIslands_206();
        char[][] grid = {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        numberofIslands_206.numIslands(grid);
    }
}