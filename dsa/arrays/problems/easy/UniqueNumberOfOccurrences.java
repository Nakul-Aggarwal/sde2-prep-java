import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * 1207. Unique Number of Occurrences
 *
 * Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
 *
 * Example 1:
 * Input: arr = [1,2,2,1,1,3]
 * Output: true
 * Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
 *
 * Example 2:
 * Input: arr = [1,2]
 * Output: false
 *
 * Example 3:
 * Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
 * Output: true
 *
 * https://leetcode.com/problems/unique-number-of-occurrences/description/
 */
public class UniqueNumberOfOccurrences {

    // Using HashMap and HashSet
    public boolean uniqueOccurrencesUsingHashMap(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            int curr = 0;
            if (map.containsKey(arr[i])) {
                curr = map.get(arr[i]);
            }
            map.put(arr[i], curr+1);
        }

        HashSet<Integer> count = new HashSet<>();
        for(int freq: map.values()) {
            if (count.contains(freq)){
                return false;
            }
            count.add(freq);
        }
        return true;
    }

    // Using Fixed Size Array
    // Given constraint: -1000 <= arr[i] <= 1000
    public boolean uniqueOccurencesUsingArray(int[] arr) {

        int[] occurenceCount = new int[2001];
        for(int i: arr) {
            occurenceCount[i + 1000]++;
        }

        Arrays.sort(occurenceCount);

        for(int i=2000; i>1; i--) {
            if (occurenceCount[i] == 0) {
                return true;
            }

            if(occurenceCount[i] == occurenceCount[i-1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {

        UniqueNumberOfOccurrences obj = new UniqueNumberOfOccurrences();

        // Example 1
        int[] arr = {1,2,2,1,1,3};
        boolean resultUsingHashMap = obj.uniqueOccurrencesUsingHashMap(arr);
        boolean resultUsingArray = obj.uniqueOccurencesUsingArray(arr);
        System.out.println("Example 1");
        System.out.println("Array is: " + Arrays.toString(arr));
        System.out.println("Result: " + resultUsingHashMap);
        System.out.println("Result: " + resultUsingArray);

    }
}