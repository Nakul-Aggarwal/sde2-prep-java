/**
 * 283. Move Zeroes
 *
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * Note that you must do this in-place without making a copy of the array.
 *
 * Example 1:
 *
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 *
 * Example 2:
 *
 * Input: nums = [0]
 * Output: [0]
 *
 * https://leetcode.com/problems/move-zeroes/description/
 */
import java.util.Arrays;

public class MoveZerosToEnd {

    public void moveZeroes(int[] nums) {

        int i = 0;

        for (int j=0; j<nums.length; j++) {
            if(nums[j] != 0) {
                nums[i++] = nums[j];
            }
        }

        while(i<nums.length) {
            nums[i++] = 0;
        }
    }

    public static void main(String[] args) {
        MoveZerosToEnd obj = new MoveZerosToEnd();

        // Test case 1
        int[] nums1 = {0, 1, 0, 3, 12};
        obj.moveZeroes(nums1);
        System.out.println("Test 1 result: " + Arrays.toString(nums1));
        // Expected: [1, 3, 12, 0, 0]

        // Test case 2
        int[] nums2 = {0};
        obj.moveZeroes(nums2);
        System.out.println("Test 2 result: " + Arrays.toString(nums2));
        // Expected: [0]
    }
}