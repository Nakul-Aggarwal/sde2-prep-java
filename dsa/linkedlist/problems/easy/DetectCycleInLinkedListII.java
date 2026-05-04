import dsa.linkedlist.implementation.LinkedListUtil;
import dsa.linkedlist.implementation.LinkedListUtil.ListNode;

/*
 *
 * 142. Linked List Cycle II
 * 
 * Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
 * 
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.
 * 
 * Do not modify the linked list.
 * 
 * Example 1:
    * Input: head = [3,2,0,-4], pos = 1
    * Output: tail connects to node index 1
    * Explanation: There is a cycle in the linked list, where tail connects to the second node.
 * Example 2:
    * Input: head = [1,2], pos = 0
    * Output: tail connects to node index 0
    * Explanation: There is a cycle in the linked list, where tail connects to the first node.
 * Example 3:
    * Input: head = [1], pos = -1
    * Output: no cycle
    * Explanation: There is no cycle in the linked list.
 * 
 * Question Link: https://leetcode.com/problems/linked-list-cycle-ii/description/
 */

public class DetectCycleInLinkedListII {

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                while (head != slow) {
                    head = head.next;
                    slow = slow.next;
                }

                return head;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        DetectCycleInLinkedListII obj = new DetectCycleInLinkedListII();

        // Example 1
        int[] arr1 = {3, 2, 0, -4};
        ListNode head1 = LinkedListUtil.buildList(arr1);
        LinkedListUtil.createCycle(head1, 1);
        ListNode result1 = obj.detectCycle(head1);
        System.out.println("Example 1:");
        System.out.println("Cycle present: " + result1!=null ? result1.val : "No Cycle");
        System.out.println();
        System.out.println();

        // Example 2
        int[] arr2 = {1, 2};
        ListNode head2 = LinkedListUtil.buildList(arr2);
        LinkedListUtil.createCycle(head2, 0);
        ListNode result2 = obj.detectCycle(head2);
        System.out.println("Example 2:");
        System.out.println("Cycle present: " + result2!=null ? result2.val : "No Cycle");
        System.out.println();
        System.out.println();

        // Example 3
        int[] arr3 = {1};
        ListNode head3 = LinkedListUtil.buildList(arr3);
        ListNode result3 = obj.detectCycle(head3);
        // No cycle created
        System.out.println("Example 3:");
        System.out.println("Cycle present: " + (result3 != null ? result3.val : "No Cycle"));
    }
}
