/**
 * 27. Remove Element
 *
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
 *
 * Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
 *
 * Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
 * Return k.
 *
 * Example 1:
 *
 * Input: nums = [3,2,2,3], val = 3
 * Output: 2, nums = [2,2,_,_]
 * Explanation: Your function should return k = 2, with the first two elements of nums being 2.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 *
 * Example 2:
 *
 * Input: nums = [0,1,2,2,3,0,4,2], val = 2
 * Output: 5, nums = [0,1,4,0,3,_,_,_]
 * Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
 * Note that the five elements can be returned in any order.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 *
 * https://leetcode.com/problems/remove-element/description/
 */
import java.util.Arrays;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int first=0;
        int last = nums.length-1;

        while(first<=last) {
            if (nums[first] == val) {
                nums[first] = nums[last];
                nums[last--] = val;
            }
            else {
                first++;
            }
        }

        return first;
    }

    public static void main(String[] args) {
        RemoveElement obj = new RemoveElement();

        // Test case 1
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int k1 = obj.removeElement(nums1, val1);
        System.out.println("Test 1 result: k = " + k1 + ", nums = " + Arrays.toString(nums1));
        // Expected: k = 2, nums = [2, 2, _, _]

        // Test case 2
        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        int k2 = obj.removeElement(nums2, val2);
        System.out.println("Test 2 result: k = " + k2 + ", nums = " + Arrays.toString(nums2));
        // Expected: k = 5, nums = [0, 1, 4, 0, 3, _, _, _]
    }
}