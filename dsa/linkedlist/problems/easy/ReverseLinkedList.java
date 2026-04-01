public class ReverseLinkedList {
    // TODO: Implement Reverse Linked List
    // Problem: Given the head of a singly linked list, reverse the list, and return the reversed list.

    // Pseudo code:
    // - Use three pointers: prev, curr, next
    // - While curr != null, next = curr.next, curr.next = prev, prev = curr, curr = next
    // - Return prev

    public ListNode reverseList(ListNode head) {
        // TODO: Implement
        return null;
    }

    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}