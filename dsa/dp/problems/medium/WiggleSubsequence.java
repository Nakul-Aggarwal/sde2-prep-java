public class WiggleSubsequence {
    // TODO: Implement Wiggle subsequence
    // Problem: A wiggle sequence is a sequence where the differences between successive numbers strictly alternate between positive and negative. The first difference (if one exists) may be either positive or negative. A sequence with one element or two non-equal elements is trivially a wiggle sequence.
    // Given an integer array nums, return the length of the longest wiggle subsequence of nums.

    // Pseudo code:
    // - DP: up[i] = max(up[i-1], down[i-1] + 1) if nums[i] > nums[i-1]
    // - down[i] = max(down[i-1], up[i-1] + 1) if nums[i] < nums[i-1]

    public int wiggleMaxLength(int[] nums) {
        // TODO: Implement
        return 0;
    }
}