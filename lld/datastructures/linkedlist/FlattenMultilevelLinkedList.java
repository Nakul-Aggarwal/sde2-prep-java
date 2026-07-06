package lld.datastructures.linkedlist;

/*
 *
 * Flatten a Multilevel Doubly Linked List.
 *
 * Each node contains:
 *      int val
 *      Node prev
 *      Node next
 *      Node child
 *
 * A child pointer points to the head of another doubly linked list.
 *
 * Flatten the list so that:
 *  - Every child list is inserted immediately after its parent node.
 *  - Child pointers become null.
 *  - Prev and Next pointers remain valid.
 *
 * Example:
 *
 *      1 <-> 2 <-> 3 <-> 4 <-> 5
 *                |
 *                7 <-> 8 <-> 9
 *                     |
 *                     11 <-> 12
 *
 * Output:
 *
 *      1 <-> 2 <-> 3 <-> 7 <-> 8 <-> 11 <-> 12 <-> 9 <-> 4 <-> 5
 *
 * Expected Time Complexity:
 *      O(N)
 *
 * Expected Space Complexity:
 *      O(H)  // recursion stack
 *
 */

public class FlattenMultilevelLinkedList {

    static class Node {

        int val;
        Node prev;
        Node next;
        Node child;

        public Node(int val) {
            this.val = val;
        }
    }

    public Node flatten(Node head) {

        if (head == null) {
            return null;
        }

        flattenRecursion(head);
        return head;
    }

    /*
     * Flattens the list starting from head
     * and returns the tail of the flattened list.
     */
    private Node flattenRecursion(Node head) {

        Node current = head;
        Node tail = head;

        while (current != null) {

            if (current.child != null) {

                Node next = current.next;

                // Flatten child list
                Node childTail = flattenRecursion(current.child);

                // Attach child after current
                current.next = current.child;
                current.child.prev = current;
                current.child = null;

                // Attach remaining list after child
                childTail.next = next;
                if (next != null) {
                    next.prev = childTail;
                }

                tail = childTail;
                current = next;

            } else {

                tail = current;
                current = current.next;
            }
        }

        return tail;
    }

    public void printList(Node head) {

        Node current = head;

        while (current != null) {

            System.out.print(current.val);

            if (current.next != null) {
                System.out.print(" <-> ");
            }

            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        FlattenMultilevelLinkedList solution = new FlattenMultilevelLinkedList();

        /*
         * Constructing:
         *
         * 1 <-> 2 <-> 3 <-> 4 <-> 5
         *           |
         *           7 <-> 8 <-> 9
         *                |
         *                11 <-> 12
         */

        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);

        one.next = two;
        two.prev = one;

        two.next = three;
        three.prev = two;

        three.next = four;
        four.prev = three;

        four.next = five;
        five.prev = four;

        Node seven = new Node(7);
        Node eight = new Node(8);
        Node nine = new Node(9);

        seven.next = eight;
        eight.prev = seven;

        eight.next = nine;
        nine.prev = eight;

        Node eleven = new Node(11);
        Node twelve = new Node(12);

        eleven.next = twelve;
        twelve.prev = eleven;

        three.child = seven;
        eight.child = eleven;

        System.out.println("Before Flatten:");
        solution.printList(one);
        solution.printList(seven);
        solution.printList(eleven);

        solution.flatten(one);

        System.out.println();

        System.out.println("After Flatten:");
        solution.printList(one);
    }
}