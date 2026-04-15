/**
 * 349. Intersection of Two Arrays
 *
 * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
 *
 * Example 1:
 *
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 *
 * Example 2:
 *
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [9,4]
 * Explanation: [4,9] is also accepted.
 *
 * https://leetcode.com/problems/intersection-of-two-arrays/description/
 */
import java.util.Arrays;

public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        // TODO: Implement
        return new int[0];
    }

    public static void main(String[] args) {
        IntersectionOfTwoArrays obj = new IntersectionOfTwoArrays();

        // Test case 1
        int[] nums1_1 = {1, 2, 2, 1};
        int[] nums2_1 = {2, 2};
        int[] result1 = obj.intersection(nums1_1, nums2_1);
        System.out.println("Test 1 result: " + Arrays.toString(result1));
        // Expected: [2]

        // Test case 2
        int[] nums1_2 = {4, 9, 5};
        int[] nums2_2 = {9, 4, 9, 8, 4};
        int[] result2 = obj.intersection(nums1_2, nums2_2);
        System.out.println("Test 2 result: " + Arrays.toString(result2));
        // Expected: [9, 4] or [4, 9]
    }
}