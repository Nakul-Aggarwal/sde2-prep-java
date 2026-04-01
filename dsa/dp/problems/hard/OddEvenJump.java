public class OddEvenJump {
    // TODO: Implement Odd even jump
    // Problem: You are given an integer array arr. From some starting index, you can make a series of jumps. The (1st, 3rd, 5th, ...) jumps in the series are called odd-numbered jumps, and the (2nd, 4th, 6th, ...) jumps in the series are called even-numbered jumps.
    // You may not jump outside of the array's bounds.
    // Each time you make an odd-numbered jump, you jump to the smallest index j > i such that arr[j] > arr[i]. If there are multiple such indices, you jump to the smallest one.
    // Each time you make an even-numbered jump, you jump to the smallest index j > i such that arr[j] < arr[i]. If there are multiple such indices, you jump to the smallest one.
    // You start at index 0, and your goal is to reach the last index of the array.
    // Return the number of indices from which you can reach the last index by following the above rules.

    // Pseudo code:
    // - DP: odd[i] = can reach end with odd jump from i, even[i] = with even

    public int oddEvenJumps(int[] arr) {
        // TODO: Implement
        return 0;
    }
}