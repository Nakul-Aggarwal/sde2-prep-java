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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class IntersectionOfTwoArrays {

    public int[] intersectionUsingSet(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for(int i: nums1) {
            set.add(i);
        }

        for(int i:nums2) {
            if(set.contains(i)) {
                result.add(i);
                set.remove(i);
            }
        }

        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }
        return res;
    }

    public int[] intersectionUsing2Pointers(int[] nums1, int[] nums2) {

        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length) {

            if(nums1[i] == nums2[j]) {
                result.add(nums1[i]);

                while (i < nums1.length - 1 && nums1[i] == nums1[i + 1]) {
                    i++;
                }
                while (j < nums2.length - 1 && nums2[j] == nums2[j + 1]) {
                    j++;
                }

                i++;
                j++;
            } else if(nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        IntersectionOfTwoArrays obj = new IntersectionOfTwoArrays();

        // Test case 1
        int[] nums1_1 = {1, 2, 2, 1};
        int[] nums2_1 = {2, 2};
        int[] result1 = obj.intersectionUsingSet(nums1_1, nums2_1);
        int[] result1_2 = obj.intersectionUsing2Pointers(nums1_1, nums2_1);
        System.out.println("Test 1 result: " + Arrays.toString(result1));
        System.out.println("Test 1 result: " + Arrays.toString(result1_2));
        // Expected: [2]

        // Test case 2
        int[] nums1_2 = {4, 9, 5};
        int[] nums2_2 = {9, 4, 9, 8, 4};
        int[] result2 = obj.intersectionUsingSet(nums1_2, nums2_2);
        int[] result2_1 = obj.intersectionUsing2Pointers(nums1_2, nums2_2);
        System.out.println("Test 2 result: " + Arrays.toString(result2));
        System.out.println("Test 2 result: " + Arrays.toString(result2_1));
        // Expected: [9, 4] or [4, 9]
    }
}