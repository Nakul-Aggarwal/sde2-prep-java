public class EditDistance {
    // TODO: Implement Edit distance
    // Problem: Given two strings word1 and word2, return the minimum number of operations required to convert word1 to word2.
    // You have the following three operations permitted on a word: Insert a character, Delete a character, Replace a character.

    // Pseudo code:
    // - DP: dp[i][j] = min(dp[i-1][j] +1, dp[i][j-1] +1, dp[i-1][j-1] + (word1[i-1]==word2[j-1]?0:1))

    public int minDistance(String word1, String word2) {
        // TODO: Implement
        return 0;
    }
}