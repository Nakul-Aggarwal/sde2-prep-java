package dsa.linkedlist.implementation;

public class LinkedListUtil {

    // Definition for singly-linked list
    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    /*
     * Build Linked List from array
     * Example: [1,2,3] -> 1 -> 2 -> 3
     */
    public static ListNode buildList(int[] arr) {

        if (arr.length == 0) {
            return null;
        }

        ListNode head = new ListNode(arr[0]);
        ListNode current = head;

        for (int i = 1; i < arr.length; i++) {

            current.next = new ListNode(arr[i]);
            current = current.next;
        }

        return head;
    }

    /*
     * Print Linked List
     * Example: 1 -> 2 -> 3
     */
    public static void printList(ListNode head) {

        ListNode current = head;

        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    /*
     * Get length of linked list
     */
    public static int length(ListNode head) {

        int len = 0;

        while (head != null) {
            len++;
            head = head.next;
        }

        return len;
    }

    public static void createCycle(ListNode head, int pos) {

        if (pos == -1) return;

        ListNode tail = head;
        ListNode joinNode = null;

        int index = 0;

        while (tail.next != null) {

            if (index == pos) {
                joinNode = tail;
            }

            tail = tail.next;
            index++;
        }

        if (joinNode != null) {
            tail.next = joinNode;
        }
    }
}