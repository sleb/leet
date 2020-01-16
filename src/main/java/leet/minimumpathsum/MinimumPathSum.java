package leet.minimumpathsum;

public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int[][] minCosts = new int[grid.length][grid[0].length];
        minCosts[0][0] = grid[0][0];
        for (int i = 1; i < grid[0].length; i++) {
            minCosts[0][i] = minCosts[0][i - 1] + grid[0][i];
        }

        for (int i = 1; i < grid.length; i++) {
            minCosts[i][0] = minCosts[i - 1][0] + grid[i][0];
        }

        for (int r = 1; r < grid.length; r++) {
            for (int c = 1; c < grid[0].length; c++) {
                minCosts[r][c] = Math.min(minCosts[r - 1][c], minCosts[r][c - 1]) + grid[r][c];
            }
        }

        return minCosts[grid.length - 1][grid[0].length - 1];
    }
}
