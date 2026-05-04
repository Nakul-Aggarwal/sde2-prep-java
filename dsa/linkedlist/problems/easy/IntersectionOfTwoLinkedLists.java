import dsa.linkedlist.implementation.LinkedListUtil;
import dsa.linkedlist.implementation.LinkedListUtil.ListNode;

/*
 *
 * 160. Intersection of Two Linked Lists
 *
 * Given the heads of two singly linked lists headA and headB,
 * return the node at which the two lists intersect.
 * If the two linked lists have no intersection, return null.
 *
 * Note:
 * - Intersection is based on reference, not value.
 *
 * Example 1:
 * Input:
 * ListA = [4,1,8,4,5]
 * ListB = [5,6,1,8,4,5]
 * (intersect at node with value 8)
 *
 * Example 2:
 * Input:
 * ListA = [1,9,1,2,4]
 * ListB = [3,2,4]
 * (intersect at node with value 2)
 *
 * Example 3:
 * Input:
 * ListA = [2,6,4]
 * ListB = [1,5]
 * (no intersection)
 *
 * Question Link:
 * https://leetcode.com/problems/intersection-of-two-linked-lists/
 *
 */

public class IntersectionOfTwoLinkedLists {

    public int getLengthOfList(ListNode head) {
        int length = 0;

        while(head != null) {
            head = head.next;
            length++;
        }
        return length;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        int lengthA = getLengthOfList(headA);
        int lengthB = getLengthOfList(headB);

        while (lengthA > lengthB) {
            headA = headA.next;
            lengthA--;
        }

        while (lengthB > lengthA) {
            headB = headB.next;
            lengthB--;
        }

        while(headA != null && headB != null) {
            if(headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }

    public static void main(String[] args) {

        IntersectionOfTwoLinkedLists obj =
                new IntersectionOfTwoLinkedLists();

        /*
         * Example 1:
         * A: 4 -> 1 \
         *               8 -> 4 -> 5
         * B:    5 -> 6 -> 1 /
         */

        ListNode common = new ListNode(8);
        common.next = new ListNode(4);
        common.next.next = new ListNode(5);

        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = common;

        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = common;

        System.out.println("Example 1:");
        System.out.print("List A: ");
        LinkedListUtil.printList(headA);
        System.out.print("List B: ");
        LinkedListUtil.printList(headB);

        ListNode result1 = obj.getIntersectionNode(headA, headB);

        System.out.println("Intersection Node: " +
                (result1 != null ? result1.val : "null"));
        System.out.println();
        System.out.println();


        /*
         * Example 2:
         * A: 1 -> 9 -> 1 \
         *                   2 -> 4
         * B:       3 ------/
         */

        ListNode common2 = new ListNode(2);
        common2.next = new ListNode(4);

        ListNode headA2 = new ListNode(1);
        headA2.next = new ListNode(9);
        headA2.next.next = new ListNode(1);
        headA2.next.next.next = common2;

        ListNode headB2 = new ListNode(3);
        headB2.next = common2;

        System.out.println("Example 2:");
        System.out.print("List A: ");
        LinkedListUtil.printList(headA2);
        System.out.print("List B: ");
        LinkedListUtil.printList(headB2);

        ListNode result2 = obj.getIntersectionNode(headA2, headB2);

        System.out.println("Intersection Node: " +
                (result2 != null ? result2.val : "null"));
        System.out.println();
        System.out.println();


        /*
         * Example 3:
         * No intersection
         */

        int[] arrA3 = {2, 6, 4};
        int[] arrB3 = {1, 5};

        ListNode headA3 = LinkedListUtil.buildList(arrA3);
        ListNode headB3 = LinkedListUtil.buildList(arrB3);

        System.out.println("Example 3:");
        System.out.print("List A: ");
        LinkedListUtil.printList(headA3);
        System.out.print("List B: ");
        LinkedListUtil.printList(headB3);

        ListNode result3 = obj.getIntersectionNode(headA3, headB3);

        System.out.println("Intersection Node: " +
                (result3 != null ? result3.val : "null"));
        System.out.println();
        System.out.println();
    }
}