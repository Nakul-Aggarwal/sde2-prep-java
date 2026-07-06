package lld.datastructures.linkedlist;

import java.util.Optional;

/*
    *
    * Design and implement Singly Linked List. Need to implement all below methods
    *
    * addFirst(T value)
    * addLast(T value)
    * add(int index, T value) // 0-based index
    * removeFirst()
    * removeLast()
    * remove(int index)
    * get(int index)
    * contains(T value)
    * size()
    * isEmpty()
    * clear()
    * printList()
*/

class Node<T> {
    T val;
    Node<T> next;

    public Node(T val) {
        this.val = val;
        next = null;
    }
}

public class LinkedListDesign<T> {
    
    private Node<T> head;
    private int size;
    
    public LinkedListDesign() {
        this.head = null;
        this.size = 0;
    }

    public void addFirst(T value) {
        Node<T> newNode = new Node<T>(value);
        size++;

        if(head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(T value) {
        Node<T> newNode = new Node<T>(value);
        
        if(head == null) {
            head = newNode;
            size++;
            return;
        }

        Node<T> currNode = head;

        for(int index=1; index<size; index++) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
        size++;
    }

    public void add(int index, T value) {

        if(index > size || index < 0) {
            System.out.println("Invalid index entered");
            return;
        }

        Node<T> newNode = new Node<T>(value);
        size++;

        if(head == null || index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node<T> currNode = head;

        for(int i=1; i<index; i++) {
            currNode = currNode.next;
        }

        newNode.next = currNode.next;
        currNode.next = newNode;
    }

    public void removeFirst() {
        if(head != null) {
            head = head.next;
            size--;
        }
    }

    public void removeLast() {
        if(head == null) {
            return;
        }

        if(size == 1) {
            head = null;
            size--;
            return;
        }

        Node<T> currNode = head;
        for(int index=1; index<size-1; index++) {
            currNode = currNode.next;
        }

        currNode.next = null;
        size--;
    }

    public void remove(int index) {
        if(index >= size || index < 0 || head == null) {
            return;
        }

        if(index == 0) {
            head = head.next;
            size--;
            return;
        }

        Node<T> currNode = head;

        for(int i=1; i<index; i++) {
            currNode = currNode.next;
        }

        currNode.next = currNode.next.next;
        size--;
    }

    public Optional<T> get(int index) {

        return Optional.empty();
    }

    public boolean contains(T value) {

        Node<T> currNode = head;
        while(currNode != null) {
            if(currNode.val.equals(value)) {
                return true;
            }
            currNode = currNode.next;
        }
        return false;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void printList() {
        
        Node<T> currNode = head;

        while(currNode != null) {
            System.out.print(currNode.val + " ");
            currNode = currNode.next;

            if(currNode != null) {
                System.out.print("-> ");
            }
        }
    }

    public static void main(String[] args) {

        LinkedListDesign<Integer> list = new LinkedListDesign<>();

        System.out.println("========== Initial State ==========");
        list.printList();
        System.out.println("\nSize: " + list.size());
        System.out.println("Is Empty: " + list.isEmpty());

        System.out.println("\n========== addFirst() ==========");
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.printList(); // 30 -> 20 -> 10

        System.out.println("\n\n========== addLast() ==========");
        list.addLast(40);
        list.addLast(50);
        list.printList(); // 30 -> 20 -> 10 -> 40 -> 50

        System.out.println("\n\n========== add(index, value) ==========");
        list.add(0, 100);     // Beginning
        list.add(3, 200);     // Middle
        list.add(list.size(), 300); // End
        list.printList();

        System.out.println("\n\n========== contains() ==========");
        System.out.println("Contains 40 : " + list.contains(40));
        System.out.println("Contains 99 : " + list.contains(99));

        System.out.println("\n\n========== removeFirst() ==========");
        list.removeFirst();
        list.printList();

        System.out.println("\n\n========== removeLast() ==========");
        list.removeLast();
        list.printList();

        System.out.println("\n\n========== remove(index) ==========");
        list.remove(2);
        list.printList();

        System.out.println("\n\n========== remove(head) ==========");
        list.remove(0);
        list.printList();

        System.out.println("\n\n========== size() ==========");
        System.out.println("Size: " + list.size());

        System.out.println("\n\n========== clear() ==========");
        list.clear();
        list.printList();

        System.out.println("\nSize: " + list.size());
        System.out.println("Is Empty: " + list.isEmpty());

        System.out.println("\n\n========== Edge Cases ==========");

        list.removeFirst();
        list.removeLast();
        list.remove(0);

        list.addLast(1);
        list.printList();

        System.out.println("\nRemoving only element...");
        list.removeLast();
        list.printList();

        System.out.println("\nIs Empty: " + list.isEmpty());
    }
}
