public class SinglyLinkedList<T> {
    // TODO: Implement a singly linked list

    // Pseudo code:
    // - Define a Node class with data and next
    // - Keep head and tail references
    // - addFirst(T data): create new node, set as head
    // - addLast(T data): create new node, set as tail
    // - removeFirst(): remove head, return data
    // - removeLast(): traverse to find previous of tail, remove
    // - get(int index): traverse to index
    // - size, isEmpty methods

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public SinglyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    // TODO: Implement methods
}