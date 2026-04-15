/**
 * 88. Merge Sorted Array
 *
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 *
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 *
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 *
 * Example 1:
 *
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
 * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 *
 * Example 2:
 *
 * Input: nums1 = [1], m = 1, nums2 = [], n = 0
 * Output: [1]
 * Explanation: The arrays we are merging are [1] and [].
 * The result of the merge is [1].
 *
 * https://leetcode.com/problems/merge-sorted-array/description/
 */
import java.util.Arrays;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i = nums1.length-1;

        while (m>0 && n>0) {
            if(nums1[m-1] > nums2[n-1]) {
                nums1[i] = nums1[m-1];
                i--;
                m--;
            } else {
                nums1[i] = nums2[n-1];
                n--;
                i--;
            }
        }

        while (n>0) {
            nums1[i] = nums2[n-1];
            n--;
            i--;
        }
    }

    public static void main(String[] args) {
        MergeSortedArray obj = new MergeSortedArray();

        // Test case 1
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        obj.merge(nums1, m, nums2, n);
        System.out.println("Test 1 result: " + Arrays.toString(nums1));
        // Expected: [1, 2, 2, 3, 5, 6]

        // Test case 2
        int[] nums1_2 = {1};
        int m2 = 1;
        int[] nums2_2 = {};
        int n2 = 0;
        obj.merge(nums1_2, m2, nums2_2, n2);
        System.out.println("Test 2 result: " + Arrays.toString(nums1_2));
        // Expected: [1]
    }
}