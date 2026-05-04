import dsa.linkedlist.implementation.LinkedListUtil;
import dsa.linkedlist.implementation.LinkedListUtil.ListNode;

/*
 *
 * 234. Palindrome Linked List
 *
 * Given the head of a singly linked list,
 * return true if it is a palindrome or false otherwise.
 *
 * Example 1:
 * Input: head = [1,2,2,1]
 * Output: true
 *
 * Example 2:
 * Input: head = [1,2]
 * Output: false
 *
 * Question Link:
 * https://leetcode.com/problems/palindrome-linked-list/
 *
 */

public class PalindromeLinkedList {

    /*
     * Optimized Approach (Fast & Slow + Reverse Second Half)
     *
     * Steps:
     * 1. Find middle using slow & fast pointers
     * 2. Reverse second half of list
     * 3. Compare first half and second half
     * 4. (Optional) Restore the list
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     *
     */
    public boolean isPalindrome(ListNode head) {
        
        if(head == null || head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast == null) {
            slow = reverseLinkedList(slow);
        } else {
            slow = reverseLinkedList(slow.next);
        }

        while(slow != null) {
            if(head.val != slow.val) {
                return false;
            }

            head = head.next;
            slow = slow.next;
        }

        return true;
    }

    public ListNode reverseLinkedList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode reversedHead = reverseLinkedList(head.next);
        head.next.next = head;
        head.next = null;

        return reversedHead;
    }

    public static void main(String[] args) {

        PalindromeLinkedList obj = new PalindromeLinkedList();

        // Example 1
        int[] arr1 = {1, 2, 2, 1};
        ListNode head1 = LinkedListUtil.buildList(arr1);

        System.out.println("Example 1:");
        System.out.print("Input List: ");
        LinkedListUtil.printList(head1);

        boolean result1 = obj.isPalindrome(head1);

        System.out.println("Output: " + result1);
        System.out.println();
        System.out.println();


        // Example 2
        int[] arr2 = {1, 2};
        ListNode head2 = LinkedListUtil.buildList(arr2);

        System.out.println("Example 2:");
        System.out.print("Input List: ");
        LinkedListUtil.printList(head2);

        boolean result2 = obj.isPalindrome(head2);

        System.out.println("Output: " + result2);
        System.out.println();
        System.out.println();
    }
}