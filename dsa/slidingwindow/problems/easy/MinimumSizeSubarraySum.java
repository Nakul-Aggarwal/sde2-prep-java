package dsa.slidingwindow.problems.easy;

import java.util.*;

/*
 *
 * 209. Minimum Size Subarray Sum
 * Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
 * 
 * Example 1:
    * Input: target = 7, nums = [2,3,1,2,4,3]
    * Output: 2
    * Explanation: The subarray [4,3] has the minimal length under the problem constraint.
 * Example 2:
    * Input: target = 4, nums = [1,4,4]
    * Output: 1
 * Example 3:
    * Input: target = 11, nums = [1,1,1,1,1,1,1,1]
    * Output: 0
 * 
 * Question Link: https://leetcode.com/problems/minimum-size-subarray-sum/description/
 * 
 */


public class MinimumSizeSubarraySum {

    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int windowSum = 0;

        int left = 0;

        for (int right =0; right < nums.length; right++) {
            windowSum += nums[right];

            while(windowSum >= target) {
                result = Math.min(result, right-left+1);
                windowSum -= nums[left];
                left++; 
            }
        }

        return result == Integer.MAX_VALUE ? 0 : result;
    }

    public static void main(String args[]) {
        MinimumSizeSubarraySum obj = new MinimumSizeSubarraySum();

        //Example 1
        int[] nums1 = {2,3,1,2,4,3};
        int target1 = 7;
        int result1 = obj.minSubArrayLen(target1, nums1);
        System.out.println("Example 1");
        System.out.println("Input array: " + Arrays.toString(nums1));
        System.out.println("Target: " + target1);
        System.out.println("Output: " + result1);
        System.out.println();
        System.out.println();

        //Example 2
        int[] nums2 = {1,4,4};
        int target2 = 4;
        int result2 = obj.minSubArrayLen(target2, nums2);
        System.out.println("Example 2");
        System.out.println("Input array: " + Arrays.toString(nums2));
        System.out.println("Target: " + target2);
        System.out.println("Output: " + result2);
        System.out.println();
        System.out.println();

        //Example 3
        int[] nums3 = {1,1,1,1,1,1,1,1};
        int target3 = 11;
        int result3 = obj.minSubArrayLen(target3, nums3);
        System.out.println("Example 3");
        System.out.println("Input array: " + Arrays.toString(nums3));
        System.out.println("Target: " + target3);
        System.out.println("Output: " + result3);
    }
}