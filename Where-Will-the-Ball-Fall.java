class Solution {
    public int[] findBall(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        int res[] = new int[cols];
        for (int i = 0; i < cols; ++i) {
            int i1 = i, i2;
            for (int j = 0; j < rows; ++j) {
                i2 = i1 + grid[j][i1];
                if (i2 < 0 || i2 >= cols || grid[j][i2] != grid[j][i1]) {
                    i1 = -1;
                    break;
                }
                i1 = i2;
            }
            res[i] = i1;
        }
        return res;
    }
}
