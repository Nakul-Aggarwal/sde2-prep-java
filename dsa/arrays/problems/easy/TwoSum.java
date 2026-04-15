/**
 * 1. Two Sum
 *
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 *
 * Example 2:
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 *
 * https://leetcode.com/problems/two-sum/description/
 */

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSumUsingHashMap(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            int difference = target - nums[i];

            if(map.containsKey(difference)) {
                return new int[]{map.get(difference), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }

    public int[] twoSumUsingBruteForce(int[] nums, int target) {
        
        for(int i=0; i<nums.length-1; i++) {
            for(int j=1; j<nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }

        return new int[]{};
    }

    public static void main(String args[]) {

        int[] nums = {3,2,4};
        TwoSum obj = new TwoSum();
        int[] result = obj.twoSumUsingHashMap(nums, 6);

        System.out.println("Returned indexes are "+ result[0] + " " + result[1]);
    }
}