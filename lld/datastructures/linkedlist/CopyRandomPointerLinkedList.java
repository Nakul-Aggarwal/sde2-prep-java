package lld.datastructures.linkedlist;

import java.util.HashMap;
import java.util.Map;

/*
 *
 * Copy List with Random Pointer
 *
 * Each node contains:
 *      int val
 *      Node next
 *      Node random
 *
 * The random pointer can point to:
 *      - Any node in the list
 *      - Itself
 *      - Null
 *
 * Create a deep copy of the linked list.
 *
 * The cloned list should contain completely new nodes while preserving:
 *
 *      1. Next relationships
 *      2. Random relationships
 *
 * Example:
 *
 * Original:
 *
 *      7 ----> 13 ----> 11 ----> 10 ----> 1
 *      |        |         |         |      |
 *      |        |         |         |      |
 *     null      7         1        11      7
 *
 * Clone:
 *
 *      7 ----> 13 ----> 11 ----> 10 ----> 1
 *      |        |         |         |      |
 *      |        |         |         |      |
 *     null      7         1        11      7
 *
 * Constraints:
 *      - Original list should remain unchanged.
 *      - Deep copy should be created.
 *
 * Expected Time Complexity:
 *      O(N)
 *
 * Expected Space Complexity:
 *      O(N)
 *
 */

public class CopyRandomPointerLinkedList {

    static class Node {

        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
        }
    }

    public Node copyRandomList(Node head) {

        if (head == null) {
            return null;
        }

        Node clonedHead = null;

        Map<Node, Node> map = new HashMap<>();

        Node originalCurrent = head;
        Node cloneCurrent = null;

        // First pass - create cloned nodes and next pointers
        while (originalCurrent != null) {

            Node clonedNode = new Node(originalCurrent.val);
            map.put(originalCurrent, clonedNode);

            if (clonedHead == null) {
                clonedHead = clonedNode;
                cloneCurrent = clonedNode;
            } else {
                cloneCurrent.next = clonedNode;
                cloneCurrent = clonedNode;
            }

            originalCurrent = originalCurrent.next;
        }

        // Second pass - assign random pointers
        originalCurrent = head;

        while (originalCurrent != null) {

            Node clonedNode = map.get(originalCurrent);
            clonedNode.random = map.get(originalCurrent.random);

            originalCurrent = originalCurrent.next;
        }

        return clonedHead;
    }

    public void printList(Node head) {

        Node current = head;

        while (current != null) {

            System.out.print("Value = " + current.val);

            if (current.random != null) {
                System.out.print(", Random = " + current.random.val);
            } else {
                System.out.print(", Random = null");
            }

            System.out.println();

            current = current.next;
        }
    }

    public static void main(String[] args) {

        CopyRandomPointerLinkedList solution = new CopyRandomPointerLinkedList();

        /*
         * Construct the following list:
         *
         * 7 -> 13 -> 11 -> 10 -> 1
         *
         * Random pointers:
         *
         * 7  -> null
         * 13 -> 7
         * 11 -> 1
         * 10 -> 11
         * 1  -> 7
         */

        Node seven = new Node(7);
        Node thirteen = new Node(13);
        Node eleven = new Node(11);
        Node ten = new Node(10);
        Node one = new Node(1);

        seven.next = thirteen;
        thirteen.next = eleven;
        eleven.next = ten;
        ten.next = one;

        seven.random = null;
        thirteen.random = seven;
        eleven.random = one;
        ten.random = eleven;
        one.random = seven;

        System.out.println("Original List:");
        solution.printList(seven);

        Node clonedHead = solution.copyRandomList(seven);

        System.out.println("\nCloned List:");
        solution.printList(clonedHead);
    }
}