public class MaximumProfitInJobScheduling {
    // TODO: Implement Maximum profit in job scheduling
    // Problem: We have n jobs, where every job is scheduled to be done from startTime[i] to endTime[i], obtaining a profit of profit[i].
    // You're given the startTime, endTime and profit arrays, return the maximum profit you can take such that there are no two jobs in the set with overlapping time range.
    // If you choose a job that ends at time X you will be able to start another job that starts at time X.

    // Pseudo code:
    // - Sort by end time, DP: dp[i] = max(dp[i-1], profit[i] + dp[prev non-overlapping])

    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        // TODO: Implement
        return 0;
    }
}