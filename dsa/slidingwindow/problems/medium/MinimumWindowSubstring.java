import java.util.*;

/*
 *
 * 76. Minimum Window Substring
 * 
 * Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".
 * 
 * The testcases will be generated such that the answer is unique.
 * 
 * Example 1:
    * Input: s = "ADOBECODEBANC", t = "ABC"
    * Output: "BANC"
    * Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
 * Example 2:
    * Input: s = "a", t = "a"
    * Output: "a"
    * Explanation: The entire string s is the minimum window.
 * Example 3:
    * Input: s = "a", t = "aa"
    * Output: ""
    * Explanation: Both 'a's from t must be included in the window. Since the largest window of s only has one 'a', return empty string.
 * 
 * 
 *  Question Link: https://leetcode.com/problems/minimum-window-substring/description/ 
 */

public class MinimumWindowSubstring {

    public boolean isValidSubstring(String s, Map<Character, Integer> freqMap, int i, int j) {

        Map<Character, Integer> frequencies = new HashMap<>();

        while (i<=j) {
            frequencies.put(s.charAt(i), frequencies.getOrDefault(s.charAt(i), 0) + 1);
            i++;
        }

        for(Character ch: freqMap.keySet()) {
            if(!frequencies.containsKey(ch) || (freqMap.get(ch) > frequencies.get(ch))) {
                return false;
            }
        }

        return true;
    }

    public String minimumWindowSubstringBruteForce(String s, String t) {

        Map<Character, Integer> freqMap = new HashMap<>();
        int minimumLength = Integer.MAX_VALUE;
        String result = "";

        for(int i=0; i<t.length(); i++) {
            freqMap.put(t.charAt(i), freqMap.getOrDefault(t.charAt(i),0) +1);
        }

        for(int i=0; i< s.length(); i++) {
            for (int j=i; j<s.length(); j++) {
                if(isValidSubstring(s, freqMap, i, j)){
                    if ((j-i+1) < minimumLength) {
                        minimumLength = j-i+1;
                        result = s.substring(i,j+1);
                    }
                }
            }
        }
        return result;
    }

    private String minimumWindowSubstringSlidingWindow(String s, String t) {

        String result = "";
        int minLength = Integer.MAX_VALUE;
        int m = s.length();

        if(m<t.length()) {
            return result;
        }

        HashMap<Character, Integer> freqMap = new HashMap<>();

        for(int i=0; i<t.length(); i++) {
            freqMap.put(t.charAt(i), freqMap.getOrDefault(t.charAt(i), 0) + 1);
        }

        int left = 0;
        int required = t.length();

        for(int right = 0; right<m; right++) {
            
            freqMap.put(
                s.charAt(right), freqMap.getOrDefault(s.charAt(right), 0) - 1);

            if(freqMap.get(s.charAt(right)) >= 0) {
                required--;
            }

            while(required == 0) {
                if(minLength > right-left+1) {
                    result = s.substring(left, right+1);
                    minLength = right-left+1;
                }

                freqMap.put(s.charAt(left), freqMap.get(s.charAt(left)) + 1);

                if(freqMap.get(s.charAt(left)) > 0) {
                    required++;
                }
                left++;
            }
        }
        return result;
    }

    public static void main(String args[]) {

    MinimumWindowSubstring obj = new MinimumWindowSubstring();

        // Example 1
        String s1 = "ADOBECODEBANC";
        String t1 = "ABC";

        String resultBruteForce1 = obj.minimumWindowSubstringBruteForce(s1, t1);
        String resultSlidingWindow1 = obj.minimumWindowSubstringSlidingWindow(s1, t1);

        System.out.println("Example 1:");
        System.out.println("Input String s: " + s1);
        System.out.println("Input String t: " + t1);
        System.out.println("Output through bruteForce: " + resultBruteForce1);
        System.out.println("Output using sliding window: " + resultSlidingWindow1);
        System.out.println();
        System.out.println();


        // Example 2
        String s2 = "a";
        String t2 = "a";

        String resultBruteForce2 = obj.minimumWindowSubstringBruteForce(s2, t2);
        String resultSlidingWindow2 = obj.minimumWindowSubstringSlidingWindow(s2, t2);

        System.out.println("Example 2:");
        System.out.println("Input String s: " + s2);
        System.out.println("Input String t: " + t2);
        System.out.println("Output through bruteForce: " + resultBruteForce2);
        System.out.println("Output using sliding window: " + resultSlidingWindow2);
        System.out.println();
        System.out.println();


        // Example 3
        String s3 = "a";
        String t3 = "aa";

        String resultBruteForce3 = obj.minimumWindowSubstringBruteForce(s3, t3);
        String resultSlidingWindow3 = obj.minimumWindowSubstringSlidingWindow(s3, t3);

        System.out.println("Example 3:");
        System.out.println("Input String s: " + s3);
        System.out.println("Input String t: " + t3);
        System.out.println("Output through bruteForce: " + resultBruteForce3);
        System.out.println("Output using sliding window: " + resultSlidingWindow3);

    }   
}