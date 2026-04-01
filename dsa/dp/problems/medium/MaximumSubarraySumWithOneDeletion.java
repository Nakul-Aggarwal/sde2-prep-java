public class MaximumSubarraySumWithOneDeletion {
    // TODO: Implement Maximum subarray sum with one deletion
    // Problem: Given an array of integers, return the maximum sum for a non-empty subarray (contiguous elements) with at most one element deletion. In other words, you want to choose a subarray and optionally delete one element from it so that there is still at least one element left and the sum of the remaining elements is maximum possible.

    // Pseudo code:
    // - DP: left[i] = max(left[i-1] + nums[i], nums[i])
    // - right[i] = max(right[i+1] + nums[i], nums[i])
    // - max(left[i-1] + right[i+1], left[i], right[i])

    public int maximumSum(int[] arr) {
        // TODO: Implement
        return 0;
    }
}