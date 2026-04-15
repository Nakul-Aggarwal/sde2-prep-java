/**
 * 26. Remove Duplicates from Sorted Array
 *
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.
 *
 * Consider the number of unique elements in nums to be k​​​​​​​​​​​​​​. After removing duplicates, return the number of unique elements k.
 *
 * The first k elements of nums should contain the unique numbers in sorted order. The remaining elements beyond index k - 1 can be ignored.
 *
 * Example 1:
 *
 * Input: nums = [1,1,2]
 * Output: 2, nums = [1,2,_]
 * Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 *
 * Example 2:
 *
 * Input: nums = [0,0,1,1,1,2,2,3,3,4]
 * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 * Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 *
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
 */
import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int first = 0;
        int second = 1;

        while (second < nums.length) {
            if(nums[first] != nums[second]) {
                nums[++first] = nums[second];
            }
            second++;
        }

        return ++first;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray obj = new RemoveDuplicatesFromSortedArray();

        // Test case 1
        int[] nums1 = {1, 1, 2};
        int k1 = obj.removeDuplicates(nums1);
        System.out.println("Test 1 result: k = " + k1 + ", nums = " + Arrays.toString(nums1));
        // Expected: k = 2, nums = [1, 2, _]

        // Test case 2
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = obj.removeDuplicates(nums2);
        System.out.println("Test 2 result: k = " + k2 + ", nums = " + Arrays.toString(nums2));
        // Expected: k = 5, nums = [0, 1, 2, 3, 4, _, _, _, _, _]
    }
}