package dsa.slidingwindow.problems.easy;

import java.util.*;
/*
 *
 * 3. Longest Substring Without Repeating Characters
 * Given a string s, find the length of the longest substring without duplicate characters.
 * 
 * Example 1:
    * Input: s = "abcabcbb"
    * Output: 3
    * Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
 * Example 2:
    * Input: s = "bbbbb"
    * Output: 1
    * Explanation: The answer is "b", with the length of 1.
 * Example 3:
    * Input: s = "pwwkew"
    * Output: 3
    * Explanation: The answer is "wke", with the length of 3.
    * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * 
 * Question Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
 * 
 */
public class LongestSubstringWithoutRepeatingCharacters {

    private int lengthOfLongestSubstringBruteForce(String s) {
        
        Set<Character> uniqueCharacters = new HashSet<>();
        int result = 0;

        for (int i=0; i<s.length(); i++) {
            uniqueCharacters.clear();

            for (int j=i; j<s.length(); j++) {
                if(uniqueCharacters.contains(s.charAt(j))) {
                    break;
                }

                uniqueCharacters.add(s.charAt(j));
            }

            result = Math.max(result, uniqueCharacters.size());
        }

        return result;
    }

    private int lengthOfLongestSubstringSlidingWindow(String s) {

        Set<Character> uniqueCharacters = new HashSet<>();

        int result = 0;
        int i = 0, j=0;

        while(i<s.length() && j<s.length()) {
            while(uniqueCharacters.contains(s.charAt(j))) {
                uniqueCharacters.remove(s.charAt(i));
                i++;
            }

            uniqueCharacters.add(s.charAt(j));
            result = Math.max(result, uniqueCharacters.size());
            j++;
        }

        return result;
    }

    public static void main (String args[]) {

        LongestSubstringWithoutRepeatingCharacters obj = new LongestSubstringWithoutRepeatingCharacters();

        // Example 1
        String s1 = "abcabcbb";
        int resultBruteForce1 = obj.lengthOfLongestSubstringBruteForce(s1);
        int resultSlidingWindow1 = obj.lengthOfLongestSubstringSlidingWindow(s1);
        System.out.println("Example 1:");
        System.out.println("Input String:" + s1);
        System.out.println("Output through bruteForce: " + resultBruteForce1);
        System.out.println("Output using sliding window: " + resultSlidingWindow1);
        System.out.println();
        System.out.println();


        // Example 2
        String s2 = "bbbbb";
        int resultBruteForce2 = obj.lengthOfLongestSubstringBruteForce(s2);
        int resultSlidingWindow2 = obj.lengthOfLongestSubstringSlidingWindow(s2);
        System.out.println("Example 2:");
        System.out.println("Input String:" + s2);
        System.out.println("Output through bruteForce: " + resultBruteForce2);
        System.out.println("Output using sliding window: " + resultSlidingWindow2);
        System.out.println();
        System.out.println();


        // Example 3
        String s3 = "pwwkew";
        int resultBruteForce3 = obj.lengthOfLongestSubstringBruteForce(s3);
        int resultSlidingWindow3 = obj.lengthOfLongestSubstringSlidingWindow(s3);
        System.out.println("Example 3:");
        System.out.println("Input String:" + s3);
        System.out.println("Output through bruteForce: " + resultBruteForce3);
        System.out.println("Output using sliding window: " + resultSlidingWindow3);
        System.out.println();
        System.out.println();
    }
}