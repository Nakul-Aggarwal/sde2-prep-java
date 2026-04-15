import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Problem: 56. Merge Intervals
 * Link: https://leetcode.com/problems/merge-intervals/description/
 *
 * Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping
 * intervals, and return an array of the non-overlapping intervals that cover all the intervals
 * in the input.
 *
 * Example 1:
 * Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
 * Output: [[1,6],[8,10],[15,18]]
 * Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
 *
 * Example 2:
 * Input: intervals = [[1,4],[4,5]]
 * Output: [[1,5]]
 * Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 */

public class MergeIntervals {

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);
        List<int[]> result = new ArrayList<>();
        result.add(intervals[0]);
        int resultIndex = 0;

        for (int i=1; i<intervals.length; i++) {
            if (result.get(resultIndex)[1] >= intervals[i][0]) {
                result.get(resultIndex)[1] = Math.max(result.get(resultIndex)[1], intervals[i][1]);
            } else {
                result.add(intervals[i]);
                resultIndex++;
            }
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String args[]) {
        int[][] intervals = new int[][]{{1,3},{2,6},{8,10},{15,18}};

        MergeIntervals mergeIntervals = new MergeIntervals();
        int[][] result = mergeIntervals.merge(intervals);

        for(int i=0; i<result.length; i++) {
            System.out.print("[ ");
            for (int j=0; j<result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println("]");
        }
    }
}