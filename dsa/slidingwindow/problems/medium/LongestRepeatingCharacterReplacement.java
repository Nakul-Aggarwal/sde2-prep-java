import java.util.*;

/*
 *
 * 424. Longest Repeating Character Replacement
 *
 * You are given a string s and an integer k.
 * You can choose any character of the string and change it to any other uppercase English character.
 * You can perform this operation at most k times.
 *
 * Return the length of the longest substring containing the same letter
 * you can get after performing the above operations.
 *
 * Example 1:
    * Input: s = "ABAB", k = 2
    * Output: 4
    * Explanation: Replace the two 'A's with two 'B's or vice versa.
 *
 * Example 2:
    * Input: s = "AABABBA", k = 1
    * Output: 4
    * Explanation: Replace one 'A' in the middle with 'B' and form "AABBBBA".
    * The substring "BBBB" has the longest repeating letters, which is 4.
 *
 * Question Link: https://leetcode.com/problems/longest-repeating-character-replacement/description/
 *
 */

public class LongestRepeatingCharacterReplacement {

    private int characterReplacementBruteForce(String s, int k) {

        if (k >= s.length()-1) {
            return s.length();
        }

        int result = 0;
        HashMap<Character, Integer> freqMap = new HashMap<>();
        
        for(int i=0; i<s.length(); i++) {
            freqMap.clear();
            int maxFreq = 0;

            for(int j=i; j<s.length(); j++) {
                freqMap.put(s.charAt(j), freqMap.getOrDefault(s.charAt(j), 0) + 1);
                maxFreq = Math.max(maxFreq, freqMap.get(s.charAt(j)));

                if(j-i+1 - maxFreq <= k) {
                    result = Math.max(result, j-i+1);
                }
            }
        }

        return result;
    }

    private int characterReplacementSlidingWindow(String s, int k) {

        HashMap<Character, Integer> freqMap = new HashMap<>();
        int maxFreq = 0;
        int result = 0;

        int left = 0;
        for(int right = 0; right<s.length(); right++) {
            freqMap.put(
                s.charAt(right), freqMap.getOrDefault(s.charAt(right), 0) +1);
            
            maxFreq = Math.max(maxFreq, freqMap.get(s.charAt(right)));

            int windowLength = right-left+1;

            while(windowLength-maxFreq > k) {
                freqMap.put(s.charAt(left), freqMap.get(s.charAt(left))-1);
                left++;
                windowLength = right-left+1;
            }

            result = Math.max(result, windowLength);
        }

        return result;
    }

    public static void main(String[] args) {

        LongestRepeatingCharacterReplacement obj =
                new LongestRepeatingCharacterReplacement();

        // Example 1
        String s1 = "ABAB";
        int k1 = 2;
        int resultBruteForce1 = obj.characterReplacementBruteForce(s1, k1);
        int resultSlidingWindow1 = obj.characterReplacementSlidingWindow(s1, k1);

        System.out.println("Example 1:");
        System.out.println("Input String: " + s1);
        System.out.println("K Value: " + k1);
        System.out.println("Output through bruteForce: " + resultBruteForce1);
        System.out.println("Output using sliding window: " + resultSlidingWindow1);
        System.out.println();
        System.out.println();

        // Example 2
        String s2 = "AABABBA";
        int k2 = 1;
        int resultBruteForce2 = obj.characterReplacementBruteForce(s2, k2);
        int resultSlidingWindow2 = obj.characterReplacementSlidingWindow(s2, k2);

        System.out.println("Example 2:");
        System.out.println("Input String: " + s2);
        System.out.println("K Value: " + k2);
        System.out.println("Output through bruteForce: " + resultBruteForce2);
        System.out.println("Output using sliding window: " + resultSlidingWindow2);
        System.out.println();
        System.out.println();
    }
}