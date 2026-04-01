public class MinimumCostToMakeAtLeastOneValidPathInAGrid {
    // TODO: Implement Minimum cost to make at least one valid path in a grid
    // Problem: Given an m x n grid. Each cell of the grid has a sign pointing to the next cell you should visit if you are currently in this cell. The sign of grid[i][j] can be:
    // - 1 which means go to the right cell. That is, go from grid[i][j] to grid[i][j + 1]
    // - 2 which means go to the left cell. That is, go from grid[i][j] to grid[i][j - 1]
    // - 3 which means go to the lower cell. That is, go from grid[i][j] to grid[i + 1][j]
    // - 4 which means go to the upper cell. That is, go from grid[i][j] to grid[i - 1][j]
    // Notice that there could be some signs on the path that aren't pointing to the next cell in the path.
    // A valid path in the grid is a path that starts from the upper left cell (0, 0) and ends at the bottom right cell (m - 1, n - 1) following the signs on the grid. The path can be messed up with some obstacles, and we can remove some of the signs and replace them with any other sign to make at least one valid path from the upper left cell to the bottom right cell.
    // Return the minimum number of signs that need to be changed to make at least one valid path from the upper left cell to the bottom right cell.

    // Pseudo code:
    // - BFS with 0-1

    public int minCost(int[][] grid) {
        // TODO: Implement
        return 0;
    }
}