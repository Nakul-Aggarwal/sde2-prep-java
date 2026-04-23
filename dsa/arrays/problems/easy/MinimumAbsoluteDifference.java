/**
 * 1200. Minimum Absolute Difference
 *
 * Given an array of distinct integers arr, find all pairs of elements with the minimum absolute difference of any two elements.
 *
 * Return a list of pairs in ascending order(with respect to pairs), each pair [a, b] follows
 *
 * a, b are from arr
 * a < b
 * b - a equals to the minimum absolute difference of any two elements in arr
 *
 * Example 1:
 *
 * Input: arr = [4,2,1,3]
 * Output: [[1,2],[2,3],[3,4]]
 * Explanation: The minimum absolute difference is 1. List all pairs with difference equal to 1 in ascending order.
 *
 * Example 2:
 *
 * Input: arr = [1,3,6,10,15]
 * Output: [[1,3]]
 *
 * Example 3:
 *
 * Input: arr = [3,8,-10,23,19,-4,-14,27]
 * Output: [[-14,-10],[19,23],[23,27]]
 *
 * https://leetcode.com/problems/minimum-absolute-difference/description/
 */
import java.util.*;

public class MinimumAbsoluteDifference {

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);

        List<List<Integer>> result = new ArrayList<>();
        int minDifference = Integer.MAX_VALUE;

        for (int i=0; i<arr.length-1; i++) {
            int difference = arr[i+1] - arr[i];

            if(difference < minDifference) {
                minDifference = difference;
                result.clear();
                result.add(Arrays.asList(arr[i], arr[i+1]));
            } else if (difference == minDifference) {
                result.add(Arrays.asList(arr[i], arr[i+1]));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        MinimumAbsoluteDifference obj = new MinimumAbsoluteDifference();

        // Test case 1
        int[] arr1 = {4, 2, 1, 3};
        List<List<Integer>> result1 = obj.minimumAbsDifference(arr1);
        System.out.println("Test 1 result: " + result1);
        // Expected: [[1,2],[2,3],[3,4]]

        // Test case 2
        int[] arr2 = {1, 3, 6, 10, 15};
        List<List<Integer>> result2 = obj.minimumAbsDifference(arr2);
        System.out.println("Test 2 result: " + result2);
        // Expected: [[1,3]]

        // Test case 3
        int[] arr3 = {3, 8, -10, 23, 19, -4, -14, 27};
        List<List<Integer>> result3 = obj.minimumAbsDifference(arr3);
        System.out.println("Test 3 result: " + result3);
        // Expected: [[-14,-10],[19,23],[23,27]]
    }
}