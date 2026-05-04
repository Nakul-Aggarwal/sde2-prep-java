import dsa.linkedlist.implementation.LinkedListUtil;
import dsa.linkedlist.implementation.LinkedListUtil.ListNode;

/*
 *
 * 19. Remove Nth Node From End of List
 *
 * Given the head of a linked list, remove the nth node from the end
 * of the list and return its head.
 *
 * Example 1:
 * Input: head = [1,2,3,4,5], n = 2
 * Output: [1,2,3,5]
 *
 * Example 2:
 * Input: head = [1], n = 1
 * Output: []
 *
 * Example 3:
 * Input: head = [1,2], n = 1
 * Output: [1]
 * 
 * Question Link: https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
 *
 */

public class RemoveNthNodeFromEnd {

    /*
     * Brute Force Approach (Two Pass)
     *
     * Steps:
     * 1. Find length
     * 2. Remove (length-n)th node
     *
     */
    public ListNode removeNthFromEndBruteForce(ListNode head, int n) {
    
        ListNode current = head;
        int length = 0;

        while(current != null) {
            current = current.next;
            length++;
        }

        // Edge case: remove head
        if (length == n) {
            return head.next;
        }

        int count = 1;
        current = head;
        while(count < length - n) {
            count++;
            current = current.next;
        }

        current.next = current.next.next;
        return head;
    }

    /*
     * Optimized Approach (One Pass - Two Pointer)
     *
     * Steps:
     * 1. Use fast & slow pointers
     * 2. Maintain gap of n
     * 3. Remove node
     *
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode current = head;
        while(n>0) {
            current = current.next;
            n--;
        }

        if(current == null) {
            return head.next;
        }

        ListNode start = head;

        while(current.next!=null) {
            start = start.next;
            current = current.next;
        }

        start.next = start.next.next;

        return head;
    }

    public static void main(String[] args) {

        RemoveNthNodeFromEnd obj = new RemoveNthNodeFromEnd();

        // Example 1
        int[] arr1 = {1, 2, 3, 4, 5};
        ListNode head1 = LinkedListUtil.buildList(arr1);

        System.out.println("Example 1:");
        System.out.print("Input List: ");
        LinkedListUtil.printList(head1);
        System.out.println("n = 2");

        ListNode resultBruteForce1 = obj.removeNthFromEndBruteForce(head1, 2);
        System.out.print("Output (BruteForce): ");
        LinkedListUtil.printList(resultBruteForce1);

        head1 = LinkedListUtil.buildList(arr1);
        ListNode resultOptimal1 = obj.removeNthFromEnd(head1, 2);

        System.out.print("Output (Optimal): ");
        LinkedListUtil.printList(resultOptimal1);

        System.out.println();
        System.out.println();


        // Example 2
        int[] arr2 = {1};
        ListNode head2 = LinkedListUtil.buildList(arr2);

        System.out.println("Example 2:");
        System.out.print("Input List: ");
        LinkedListUtil.printList(head2);
        System.out.println("n = 1");

        ListNode resultBruteForce2 = obj.removeNthFromEndBruteForce(head2, 1);

        System.out.print("Output (BruteForce): ");
        LinkedListUtil.printList(resultBruteForce2);

        head2 = LinkedListUtil.buildList(arr2);

        ListNode resultOptimal2 = obj.removeNthFromEnd(head2, 1);

        System.out.print("Output (Optimal): ");
        LinkedListUtil.printList(resultOptimal2);

        System.out.println();
        System.out.println();


        // Example 3
        int[] arr3 = {1, 2};
        ListNode head3 = LinkedListUtil.buildList(arr3);

        System.out.println("Example 3:");
        System.out.print("Input List: ");
        LinkedListUtil.printList(head3);
        System.out.println("n = 1");

        ListNode resultBruteForce3 = obj.removeNthFromEndBruteForce(head3, 1);

        System.out.print("Output (BruteForce): ");
        LinkedListUtil.printList(resultBruteForce3);

        head3 = LinkedListUtil.buildList(arr3);

        ListNode resultOptimal3 = obj.removeNthFromEnd(head3, 1);

        System.out.print("Output (Optimal): ");
        LinkedListUtil.printList(resultOptimal3);
    }
}