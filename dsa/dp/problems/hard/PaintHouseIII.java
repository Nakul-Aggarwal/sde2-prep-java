public class PaintHouseIII {
    // TODO: Implement Paint house III
    // Problem: There is a row of m houses in a small city, each house must be painted with one of the n colors listed in a 0-indexed integer array houses[m] where houses[i] is either -1 or a color index from 0 to n - 1.
    // Each house also has a 0-indexed integer array cost[m][n] where cost[i][j] is the cost of painting house i with color j.
    // The city has the following rules:
    // Every house must be painted exactly one color.
    // Houses in the same group must be painted the same color.
    // If houses[i] != -1, then house i must be painted with color houses[i].
    // You want to find the minimum cost to paint all houses such that there are exactly target groups of the same color. If it is not possible, return -1.

    // Pseudo code:
    // - DP: dp[i][j][k] = min cost for first i houses, j groups, last color k

    public int minCost(int[] houses, int[][] cost, int m, int n, int target) {
        // TODO: Implement
        return 0;
    }
}