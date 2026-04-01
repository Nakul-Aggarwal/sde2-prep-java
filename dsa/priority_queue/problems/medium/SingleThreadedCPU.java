public class SingleThreadedCPU {
    // TODO: Implement Single-threaded CPU
    // Problem: You are given n tasks labeled from 0 to n-1 represented by a 2D integer array tasks where tasks[i] = [enqueueTimei, processingTimei] means that the ith task will be available to process at enqueueTimei and will take processingTimei to finish processing.
    // You have a single-threaded CPU that can process at most one task at a time and will act in the following way:
    // - If the CPU is idle and there are no available tasks to process, the CPU remains idle.
    // - If the CPU is idle and there are available tasks, the CPU will choose the one with the smallest index.
    // - If multiple tasks have the same enqueue time, choose the one with the smallest index.
    // - If the CPU is busy and there are available tasks, the CPU will choose the one with the earliest enqueue time. If multiple tasks have the same enqueue time, choose the one with the smallest index.
    // Return the order in which the CPU will process the tasks as an array of indices.

    // Pseudo code:
    // - Min heap

    public int[] getOrder(int[][] tasks) {
        // TODO: Implement
        return new int[0];
    }
}