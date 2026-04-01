public class StackUsingLL<T> {
    // TODO: Implement stack using linked list

    // Pseudo code:
    // - Use a linked list as underlying structure
    // - push(T item): add to front (or end, depending on implementation)
    // - pop(): remove from front
    // - peek(): return top without removing
    // - isEmpty(), size()

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node<T> top;
    private int size;

    public StackUsingLL() {
        top = null;
        size = 0;
    }

    // TODO: Implement methods
}