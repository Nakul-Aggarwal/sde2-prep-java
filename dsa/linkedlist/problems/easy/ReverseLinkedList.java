/**
 * 206. Reverse Linked List
 * Solved | Easy
 *
 * Description:
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 *
 * Example 1:
 * Input: head = [1,2,3,4,5]
 * Output: [5,4,3,2,1]
 *
 * Example 2:
 * Input: head = [1,2]
 * Output: [2,1]
 *
 * Question Link: https://leetcode.com/problems/reverse-linked-list/description/
 */
public class ReverseLinkedList {

    // Definition for singly-linked list
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    /**
     * Reverses a singly linked list using iterative approach
     * Time Complexity: O(n) - traverse each node once
     * Space Complexity: O(1) - only using constant extra space
     */
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode result = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return result;
    }

    // Helper method to create a linked list from array
    public static ListNode createList(int[] values) {
        if (values == null || values.length == 0) {
            return null;
        }

        ListNode head = new ListNode(values[0]);
        ListNode current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }

        return head;
    }

    // Helper method to print linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseLinkedList solution = new ReverseLinkedList();

        // Test Case 1: Normal case [1,2,3,4,5]
        System.out.println("Test Case 1: [1,2,3,4,5]");
        ListNode head1 = createList(new int[]{1, 2, 3, 4, 5});
        System.out.print("Original: ");
        printList(head1);
        ListNode reversed1 = solution.reverseList(head1);
        System.out.print("Reversed: ");
        printList(reversed1);
        System.out.println();

        // Test Case 2: Two nodes [1,2]
        System.out.println("Test Case 2: [1,2]");
        ListNode head2 = createList(new int[]{1, 2});
        System.out.print("Original: ");
        printList(head2);
        ListNode reversed2 = solution.reverseList(head2);
        System.out.print("Reversed: ");
        printList(reversed2);
        System.out.println();

        // Test Case 3: Single node [1]
        System.out.println("Test Case 3: [1]");
        ListNode head3 = createList(new int[]{1});
        System.out.print("Original: ");
        printList(head3);
        ListNode reversed3 = solution.reverseList(head3);
        System.out.print("Reversed: ");
        printList(reversed3);
        System.out.println();

        // Test Case 4: Empty list
        System.out.println("Test Case 4: Empty list");
        ListNode head4 = createList(new int[]{});
        System.out.print("Original: ");
        printList(head4);
        ListNode reversed4 = solution.reverseList(head4);
        System.out.print("Reversed: ");
        printList(reversed4);
        System.out.println();

        // Test Case 5: Three nodes [1,2,3]
        System.out.println("Test Case 5: [1,2,3]");
        ListNode head5 = createList(new int[]{1, 2, 3});
        System.out.print("Original: ");
        printList(head5);
        ListNode reversed5 = solution.reverseList(head5);
        System.out.print("Reversed: ");
        printList(reversed5);
    }
}