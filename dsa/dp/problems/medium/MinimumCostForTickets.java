public class MinimumCostForTickets {
    // TODO: Implement Minimum cost for tickets
    // Problem: You have planned some train traveling one year in advance. The days of the year in which you will travel are given as an array days. Each day is an integer from 1 to 365.
    // Train tickets are sold in three different ways: a 1-day pass is sold for costs[0] dollars, a 7-day pass is sold for costs[1] dollars, and a 30-day pass is sold for costs[2] dollars.
    // The passes allow that many days of consecutive travel.
    // Return the minimum number of dollars you need to travel every day in the given list of days.

    // Pseudo code:
    // - DP: dp[i] = min(dp[i-1] + costs[0], dp[i-7] + costs[1], dp[i-30] + costs[2])

    public int mincostTickets(int[] days, int[] costs) {
        // TODO: Implement
        return 0;
    }
}