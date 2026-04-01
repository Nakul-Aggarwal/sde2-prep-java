public class MinHeap {
    // TODO: Implement a min heap

    // Pseudo code:
    // - Use an array to store elements
    // - heapifyUp(int index): swap with parent if smaller
    // - heapifyDown(int index): swap with smaller child if larger
    // - insert(int val): add to end, heapifyUp
    // - extractMin(): remove root, move last to root, heapifyDown
    // - peek(): return root
    // - size, isEmpty

    private int[] heap;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public MinHeap() {
        heap = new int[INITIAL_CAPACITY];
        size = 0;
    }

    // TODO: Implement methods
}