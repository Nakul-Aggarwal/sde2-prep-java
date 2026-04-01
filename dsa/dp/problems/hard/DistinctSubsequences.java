public class DistinctSubsequences {
    // TODO: Implement Distinct subsequences
    // Problem: Given two strings s and t, return the number of distinct subsequences of s which equals t.
    // A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ACE" is a subsequence of "ABCDE" while "AEC" is not).

    // Pseudo code:
    // - DP: dp[i][j] = dp[i-1][j] + (dp[i-1][j-1] if s[i-1]==t[j-1])

    public int numDistinct(String s, String t) {
        // TODO: Implement
        return 0;
    }
}