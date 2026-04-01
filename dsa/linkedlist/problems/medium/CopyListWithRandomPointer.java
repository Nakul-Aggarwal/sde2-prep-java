public class CopyListWithRandomPointer {
    // TODO: Implement Copy List with Random Pointer
    // Problem: A linked list of length n is given such that each node contains an additional random pointer, which could point to any node in the list, or null.
    // Construct a deep copy of the list.

    // Pseudo code:
    // - Create copy nodes interleaved
    // - Set random pointers
    // - Separate the lists

    public Node copyRandomList(Node head) {
        // TODO: Implement
        return null;
    }

    class Node {
        int val;
        Node next;
        Node random;
        public Node(int val) { this.val = val; }
    }
}