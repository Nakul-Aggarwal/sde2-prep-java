import java.util.*;

import dsa.linkedlist.implementation.LinkedListUtil;
import dsa.linkedlist.implementation.LinkedListUtil.ListNode;

/*
 * 141. Linked List Cycle
 *
 * Given head, the head of a linked list,
 * determine if the linked list has a cycle in it.
 *
 * There is a cycle in a linked list if there is some node in the list
 * that can be reached again by continuously following the next pointer.
 *
 * Return true if there is a cycle, otherwise return false.
 *
 * Example 1:
    * Input: head = [3,2,0,-4], pos = 1
    * Output: true
    * Explanation: Tail connects to node at index 1.
 *
 * Example 2:
    * Input: head = [1,2], pos = 0
    * Output: true
 *
 * Example 3:
    * Input: head = [1], pos = -1
    * Output: false
 *
 * Question Link: https://leetcode.com/problems/linked-list-cycle/
 *
 */
public class DetectCycleInLinkedList {

    public boolean hasCycleBruteForce(ListNode head) {

        Set<ListNode> visitedNodes = new HashSet<>();

        while(head!=null) {
            if(visitedNodes.contains(head)) {
                return true;
            }
            visitedNodes.add(head);
            head = head.next;
        }

        return false;
    }

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                return true;
            }

        }

        return false;
    }

    public static void main(String[] args) {

        DetectCycleInLinkedList obj = new DetectCycleInLinkedList();

        // Example 1
        int[] arr1 = {3, 2, 0, -4};
        ListNode head1 = LinkedListUtil.buildList(arr1);
        LinkedListUtil.createCycle(head1, 1);
        System.out.println("Example 1:");
        System.out.println("Cycle present (BruteForce): " + obj.hasCycleBruteForce(head1));
        System.out.println("Cycle present (Floyd): " + obj.hasCycle(head1));
        System.out.println();
        System.out.println();

        // Example 2
        int[] arr2 = {1, 2};
        ListNode head2 = LinkedListUtil.buildList(arr2);
        LinkedListUtil.createCycle(head2, 0);
        System.out.println("Example 2:");
        System.out.println("Cycle present (BruteForce): " + obj.hasCycleBruteForce(head2));
        System.out.println("Cycle present (Floyd): " + obj.hasCycle(head2));
        System.out.println();
        System.out.println();

        // Example 3
        int[] arr3 = {1};
        ListNode head3 = LinkedListUtil.buildList(arr3);
        // No cycle created
        System.out.println("Example 3:");
        System.out.println("Cycle present (BruteForce): " + obj.hasCycleBruteForce(head3));
        System.out.println("Cycle present (Floyd): " + obj.hasCycle(head3));
    }
}