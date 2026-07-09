package dsa.dailyleetcodeproblem;

import java.util.Arrays;

/*
 * 3756. Concatenate Non-Zero Digits and Multiply by Sum II
 *
 * You are given a string s of length m consisting of digits. You are also given a 2D integer array queries, where queries[i] = [li, ri].
 *
 * For each queries[i], extract the substring s[li..ri]. Then, perform the following:
    * Form a new integer x by concatenating all the non-zero digits from the substring in their original order. If there are no non-zero digits, x = 0.
    * Let sum be the sum of digits in x. The answer is x * sum.
 *
 * Return an array of integers answer where answer[i] is the answer to the ith query.
 *
 * Since the answers may be very large, return them modulo 10^9 + 7.
 *
 * Example:
 * Input: s = "10203004", queries = [[0,7],[1,3],[4,6]]
 * Output: [12340, 4, 9]
 * Explanation:
    * s[0..7] = "10203004"
    * x = 1234
    * sum = 1 + 2 + 3 + 4 = 10
    * Therefore, answer is 1234 * 10 = 12340.
    
    * s[1..3] = "020"
    * x = 2
    * sum = 2
    * Therefore, the answer is 2 * 2 = 4.

    * s[4..6] = "300"
    * x = 3
    * sum = 3
    * Therefore, the answer is 3 * 3 = 9.
 *
 * Problem Link: https://leetcode.com/problems/concatenate-non-zero-digits-and-multiply-by-sum-ii/description/?envType=daily-question&envId=2026-07-08
 */

public class SumAndMultiply {

    static final long MOD = 1_000_000_007L;

    public int[] sumAndMultiply(String s, int[][] queries) {

        int n = s.length();
        long[] sumPrefix = new long[n];
        long[] numberPrefix = new long[n];
        int[] nonZeroPrefix = new int[n];
        long[] pow = new long[n+1];

        sumPrefix[0] = s.charAt(0) - '0';
        numberPrefix[0] = s.charAt(0) - '0';
        nonZeroPrefix[0] = (s.charAt(0) != '0') ? 1 : 0;
        pow[0] = 1;

        for(int i=1; i<n; i++) {
            int digit = s.charAt(i) - '0';

            sumPrefix[i] = sumPrefix[i-1] + digit;
            if(digit != 0) {
                numberPrefix[i] = (numberPrefix[i - 1] * 10 + digit) % MOD;
                nonZeroPrefix[i] = nonZeroPrefix[i-1] + 1;
            } else {
                numberPrefix[i] = numberPrefix[i-1];
                nonZeroPrefix[i] = nonZeroPrefix[i-1];
            }
        }

        for(int i=1; i<=n; i++) {
            pow[i] = (pow[i-1]*10)%MOD;
        }

        int[] result = new int[queries.length];

        for(int i=0; i<queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];

            long sum = sumPrefix[right];

            if(left != 0) {
                sum-= sumPrefix[left-1];
            }

            long number = numberPrefix[right];
            if(left != 0) {
                int subStrLen = nonZeroPrefix[right] - nonZeroPrefix[left-1];
                number = (number - (numberPrefix[left - 1] * pow[subStrLen]) % MOD + MOD) % MOD;
            }

            result[i] = (int) ((sum*number)%MOD);
        }

        return result;
        
    }

    public static void main(String args[]) {
        SumAndMultiply obj = new SumAndMultiply();

        String s = "10203004";
        int[][] arr = {{0,7},{1,3},{4,6}};

        int[] result = obj.sumAndMultiply(s, arr);
        System.out.println(Arrays.toString(result));
    }
}
