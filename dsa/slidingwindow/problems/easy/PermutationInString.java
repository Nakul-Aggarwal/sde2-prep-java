package dsa.slidingwindow.problems.easy;

import java.util.Arrays;

/*
 *
 * 567. Permutation in String
 *
 * Given two strings s1 and s2,
 * return true if s2 contains a permutation of s1,
 * or false otherwise.
 *
 * In other words,
 * return true if one of s1's permutations
 * is the substring of s2.
 *
 * Example 1:
 * Input: s1 = "ab", s2 = "eidbaooo"
 * Output: true
 * Explanation: s2 contains one permutation of s1 ("ba").
 *
 * Example 2:
 * Input: s1 = "ab", s2 = "eidboaoo"
 * Output: false
 *
 * Question Link:
 * https://leetcode.com/problems/permutation-in-string/description/
 *
 */

public class PermutationInString {

    //Approach-1 (Brute Force) - Calculate all permutations of s1 and check if it is present in s2
    //T.C : O(n! * m)
    //S.C : O(n)

    private boolean checkInclusionBruteForce(String s1, String s2) {

        if (s1.length() > s2.length()){
            return false;
        }

        return checkPermutationExist(s1,s2,0);
    }

    private boolean checkPermutationExist(String s1, String s2, int index) {

        if(s2.contains(s1)){
            return true;
        }
        if(index == s1.length()) {
            return false;
        }

        for(int i=index+1; i< s1.length(); i++) {

            String swapped = swap(s1, index, i);
            if(checkPermutationExist(swapped, s2, index+1)) {
                return true;
            }
        }
        return false;
    }

    private String swap(String s, int i, int j) {

        char[] charArr = s.toCharArray();
        char temp = charArr[i];
        charArr[i] = charArr[j];
        charArr[j] = temp;

        return new String(charArr);
    }

    //Approach-2 (Using Sorting and Comparing) - ACCEPTED
    //T.C : O((m-n) * nlogn)
    //S.C : O(n)
    private boolean checkInclusionSorting(String s1, String s2) {

        int m = s1.length();
        int n = s2.length();

        if(m > n) {
            return false;
        }

        char[] sortedS1 = s1.toCharArray();
        Arrays.sort(sortedS1);

        for(int i=0; i<=n-m; i++) {
            char[] windowS2 = s2.substring(i, i+m).toCharArray();
            Arrays.sort(windowS2);

            if(Arrays.equals(sortedS1, windowS2)) {
                return true;
            }
        }
        
        return false;
    }


    /*
     * Sliding Window Approach
     *
     * Maintain a fixed-size window
     * of length s1.length().
     *
     * Keep track of frequencies inside window.
     *
     * If frequency arrays become equal,
     * permutation exists.
     *
     * Time Complexity: O(n * 26)
     * Space Complexity: O(1)
     *
     */
    private boolean checkInclusionSlidingWindow(String s1, String s2) {

        int windowSize = s1.length();

        if (windowSize > s2.length()) {
            return false;
        }

        int[] s1Frequencies = new int[26];

        int[] windowFrequencies = new int[26];

        for(int i=0; i<windowSize; i++) {
            s1Frequencies[s1.charAt(i) - 'a']++;
        }

        int left = 0;
        for(int right = 0; right<s2.length(); right++) {
            windowFrequencies[s2.charAt(right) - 'a']++;

            if(right-left+1 == windowSize) {
                if (Arrays.equals(s1Frequencies, windowFrequencies)) {
                    return true;
                }
                windowFrequencies[s2.charAt(left) - 'a']--;
                left++;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        PermutationInString obj = new PermutationInString();

        // Example 1
        String s1Example1 = "ab";
        String s2Example1 = "eidbaooo";
        boolean resultBruteForce1 = obj.checkInclusionBruteForce(s1Example1,s2Example1);
        boolean resultSorting1 = obj.checkInclusionSorting(s1Example1,s2Example1);
        boolean resultSlidingWindow1 = obj.checkInclusionSlidingWindow(s1Example1,s2Example1);

        System.out.println("Example 1:");
        System.out.println("Input String s1: " + s1Example1);
        System.out.println("Input String s2: " + s2Example1);
        System.out.println("Output through bruteForce: " + resultBruteForce1);
        System.out.println("Output through sorting: " + resultSorting1);
        System.out.println("Output using sliding window: " + resultSlidingWindow1);
        System.out.println();
        System.out.println();


        // Example 2
        String s1Example2 = "ab";
        String s2Example2 = "eidboaoo";
        boolean resultBruteForce2 = obj.checkInclusionBruteForce(s1Example2,s2Example2);
        boolean resultSorting2 = obj.checkInclusionSorting(s2Example2,s2Example2);
        boolean resultSlidingWindow2 =obj.checkInclusionSlidingWindow(s1Example2,s2Example2);

        System.out.println("Example 2:");
        System.out.println("Input String s1: " + s1Example2);
        System.out.println("Input String s2: " + s2Example2);
        System.out.println("Output through bruteForce: " + resultBruteForce2);
        System.out.println("Output through sorting: " + resultSorting2);
        System.out.println("Output using sliding window: " + resultSlidingWindow2);
    }
}