package lld.systems.cache.lfu.lfudoublyll;

import java.util.HashMap;
import java.util.Map;

class Node<K,V> {
    K key;
    V value;
    int frequency;
    Node<K,V> next;
    Node <K,V> prev;

    public Node() {
    }

    public Node(K key, V value) {
        this.key = key;
        this.value = value;
        this.frequency = 1;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList<K,V> {

    private Node<K,V> head;
    private Node<K,V> tail;

    public DoublyLinkedList() {
        this.head = new Node<K,V>();
        this.tail = new Node<K,V>();
        head.next = tail;
        tail.prev = head;
    }

    // add new node at the tail of the list
    public void addLast(Node<K,V> currNode) {
        Node<K,V> prevNode = tail.prev;
        prevNode.next = currNode;
        currNode.prev = prevNode;
        currNode.next = tail;
        tail.prev = currNode;
    }

    // delete node from the list and map
    public void remove(Node<K,V> currNode) {

        Node<K,V> prevNode = currNode.prev;
        Node<K,V> nextNode = currNode.next;
        currNode.prev = null;
        currNode.next = null;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }

    // delete first node of the list
    public Node<K,V> deleteHead() {
        if(head.next == tail) {
            return null;
        }

        Node<K,V> currNode = head.next;
        
        head.next = currNode.next;
        currNode.next.prev = head;
        
        currNode.prev = null;
        currNode.next = null;

        return currNode;
    }

    public boolean isEmpty() {
        return head.next == tail;
    }
}