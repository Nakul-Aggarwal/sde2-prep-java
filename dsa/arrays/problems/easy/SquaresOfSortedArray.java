/**
 * 977. Squares of a Sorted Array
 *
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 *
 * Example 1:
 *
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 *
 * Example 2:
 *
 * Input: nums = [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 *
 * https://leetcode.com/problems/squares-of-a-sorted-array/description/
 */
import java.util.Arrays;

public class SquaresOfSortedArray {

    public int[] sortedSquares(int[] nums) {
        
        int n = nums.length;
        int[] result = new int[n];
        
        int i = 0, j = n - 1;
        int k = n - 1;
        
        while (i <= j) {
            int left = nums[i] * nums[i];
            int right = nums[j] * nums[j];
            
            if (left > right) {
                result[k--] = left;
                i++;
            } else {
                result[k--] = right;
                j--;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        SquaresOfSortedArray obj = new SquaresOfSortedArray();

        // Test case 1
        int[] nums1 = {-4, -1, 0, 3, 10};
        int[] result1 = obj.sortedSquares(nums1);
        System.out.println("Test 1 result: " + Arrays.toString(result1));
        // Expected: [0, 1, 9, 16, 100]

        // Test case 2
        int[] nums2 = {-7, -3, 2, 3, 11};
        int[] result2 = obj.sortedSquares(nums2);
        System.out.println("Test 2 result: " + Arrays.toString(result2));
        // Expected: [4, 9, 9, 49, 121]
    }
}