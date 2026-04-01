public class MinimumAdditionsToMakeValidString {
    // TODO: Implement Minimum additions to make valid string
    // Problem: Given a string s of '(' and ')' parentheses, we add the minimum number of parentheses ( '(' or ')', and in any positions ) so that the resulting parentheses string is valid.
    // Formally, a parentheses string is valid if and only if: It is the empty string, or It can be written as AB (A concatenated with B), where A and B are valid strings, or It can be written as (A), where A is a valid string.

    // Pseudo code:
    // - DP: dp[i] = min(dp[j] + dp[i-j]) for j in 0..i, but optimized with stack or counter

    public int minAddToMakeValid(String s) {
        // TODO: Implement
        return 0;
    }
}