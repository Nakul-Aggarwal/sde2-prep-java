import dsa.linkedlist.implementation.LinkedListUtil;
import dsa.linkedlist.implementation.LinkedListUtil.ListNode;

/*
 *
 * 876. Middle of the Linked List
 *
 * Given the head of a singly linked list,
 * return the middle node of the linked list.
 *
 * If there are two middle nodes,
 * return the second middle node.
 *
 * Example 1:
 * Input: head = [1,2,3,4,5]
 * Output: [3,4,5]
 *
 * Example 2:
 * Input: head = [1,2,3,4,5,6]
 * Output: [4,5,6]
 *
 * Question Link:
 * https://leetcode.com/problems/middle-of-the-linked-list/
 *
 */

public class MiddleOfLinkedList {

    /*
     * Optimized Approach (Fast & Slow Pointer)
     *
     * Steps:
     * 1. Use two pointers:
     *    - slow moves 1 step
     *    - fast moves 2 steps
     *
     * 2. When fast reaches end,
     *    slow will be at middle
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     *
     */
    public ListNode middleNode(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {

        MiddleOfLinkedList obj = new MiddleOfLinkedList();

        // Example 1
        int[] arr1 = {1, 2, 3, 4, 5};
        ListNode head1 = LinkedListUtil.buildList(arr1);

        System.out.println("Example 1:");
        System.out.print("Input List: ");
        LinkedListUtil.printList(head1);

        ListNode result1 = obj.middleNode(head1);

        System.out.print("Output (Middle Node onwards): ");
        LinkedListUtil.printList(result1);

        System.out.println();
        System.out.println();


        // Example 2
        int[] arr2 = {1, 2, 3, 4, 5, 6};
        ListNode head2 = LinkedListUtil.buildList(arr2);

        System.out.println("Example 2:");
        System.out.print("Input List: ");
        LinkedListUtil.printList(head2);

        ListNode result2 = obj.middleNode(head2);

        System.out.print("Output (Middle Node onwards): ");
        LinkedListUtil.printList(result2);

        System.out.println();
        System.out.println();
    }
}