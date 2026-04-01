public class ProcessTasksUsingServers {
    // TODO: Implement Process tasks using servers
    // Problem: You are given two 0-indexed integer arrays servers and tasks of lengths n and m respectively. servers[i] is the weight of the ith server, and tasks[j] is the time needed to process the jth task in seconds.
    // You are running a simulation system that will shut down after all tasks are processed. Each server can only process one task at a time. You will be able to process the jth task starting from the jth second (0-indexed) and it takes tasks[j] seconds to process it. A task j can be processed by the ith server if the weight of the ith server is greater than or equal to the weight required by the jth task, i.e., servers[i] >= tasks[j].
    // You may choose any server to process each task, and you can process multiple tasks simultaneously. However, you cannot assign a task to a server if it is already processing a task.
    // Return the earliest time when all tasks are processed.

    // Pseudo code:
    // - Two heaps

    public int[] assignTasks(int[] servers, int[] tasks) {
        // TODO: Implement
        return new int[0];
    }
}