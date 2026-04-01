public class InterleavingStrings {
    // TODO: Implement Interleaving strings
    // Problem: Given strings s1, s2, and s3, find whether s3 is formed by an interleaving of s1 and s2.
    // An interleaving of two strings s and t is a configuration where s and t are divided into n and m substrings respectively, such that the concatenation of these substrings forms s3.

    // Pseudo code:
    // - DP: dp[i][j] = (dp[i-1][j] && s1[i-1]==s3[i+j-1]) || (dp[i][j-1] && s2[j-1]==s3[i+j-1])

    public boolean isInterleave(String s1, String s2, String s3) {
        // TODO: Implement
        return false;
    }
}