package dsa.dailyLeetcodeProblem;

import java.util.Arrays;
import java.util.HashMap;

/*  
 *
 * https://leetcode.com/problems/sum-of-distances/description/?envType=daily-question&envId=2026-04-23
 *  
 * 2615. Sum of Distances
 * 
 * You are given a 0-indexed integer array nums. 
 * There exists an array arr of length nums.length, where arr[i] is the sum of |i - j| over all j 
 * such that nums[j] == nums[i] and j != i. If there is no such j, set arr[i] to be 0.
 * 
 * Return the array arr. 
 * 
 * Example 1: 
    * Input: nums = [1,3,1,1,2] 
    * Output: [5,0,3,4,0] 
    * Explanation: 
        * When i = 0, nums[0] == nums[2] and nums[0] == nums[3]. 
        * Therefore, arr[0] = |0 - 2| + |0 - 3| = 5. 
        * When i = 1, arr[1] = 0 because there is no other index with value 3. 
        * When i = 2, nums[2] == nums[0] and nums[2] == nums[3]. 
        * Therefore, arr[2] = |2 - 0| + |2 - 3| = 3. When i = 3, nums[3] == nums[0] and nums[3] == nums[2]. 
        * Therefore, arr[3] = |3 - 0| + |3 - 2| = 4. When i = 4, arr[4] = 0 because there is no other index with value 2. 
 * Example 2: 
    * Input: nums = [0,5,3] 
    * Output: [0,0,0] 
    * Explanation: 
        * Since each element in nums is distinct, arr[i] = 0 for all i.
 */

public class SumOfDistances {

    static long[] distanceUsingBruteForce(int[] nums) {
        
        long[] result = new long[nums.length];

        for(int i=0; i<nums.length; i++) {
            long sum = 0;
            for(int j=0; j<nums.length; j++) {
                if (i==j) {
                    continue;
                }

                if(nums[i] == nums[j]) {
                    sum = sum + Math.abs(i-j);
                }
            }

            result[i] = sum;
        }

        return result;
    }

    // Approach: Prefix Sum + Hashing
    // Idea:
    // For each value, track:
    // - count of occurrences seen so far
    // - sum of their indices
    //
    // Left pass:
    // distance = i * count - sum_of_indices_before
    //
    // Right pass:
    // distance = sum_of_indices_after - i * count
    //
    // Combine both to get total distance for each index.
    //
    // Time: O(n)
    // Space: O(n)
    static long[] distanceUsingPrefixSum(int[] nums) {

        long[] result = new long[nums.length];
        HashMap<Integer, Long> prefixSum = new HashMap<>();
        HashMap<Integer, Long> frequency = new HashMap<>();

        for (int i=0; i<nums.length; i++) {
            long sum = prefixSum.getOrDefault(nums[i], 0L);
            long leftFreq = frequency.getOrDefault(nums[i], 0L);

            result[i] = (long)(leftFreq*i) - sum;

            prefixSum.put(nums[i], sum + i);
            frequency.put(nums[i], leftFreq + 1);
        }

        prefixSum.clear();
        frequency.clear();

        for (int i=nums.length-1; i>=0; i--) {
            long sum = prefixSum.getOrDefault(nums[i], 0L);
            long rightFreq = frequency.getOrDefault(nums[i], 0L);
            
            result[i] = result[i] + sum - (long)(rightFreq*i);

            prefixSum.put(nums[i], sum+i);
            frequency.put(nums[i], rightFreq+1);
        }

        return result;
    }

    public static void main(String args[]) {

        // Example 1
        int[] nums1 = {1,3,1,1,2};
        long[] result1 = distanceUsingBruteForce(nums1);
        long[] result2 = distanceUsingPrefixSum(nums1);
        System.out.println("Example 1:");
        System.out.println("Input array: " + Arrays.toString(nums1));
        System.out.println("Output with Brute Force: " + Arrays.toString(result1));
        System.out.println("Output with Prefix Sum: " + Arrays.toString(result2));
        System.out.println();
        System.out.println();

        //Example 2
        int[] nums2 = {0,5,3};
        result1 = distanceUsingBruteForce(nums2);
        result2 = distanceUsingPrefixSum(nums2);
        System.out.println("Example 2:");
        System.out.println("Input array: " + Arrays.toString(nums2));
        System.out.println("Output with Brute Force: " + Arrays.toString(result1));
        System.out.println("Output with Prefix Sum: " + Arrays.toString(result2));

    }
    
}
