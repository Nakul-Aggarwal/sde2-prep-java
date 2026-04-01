public class CustomHashMap<K, V> {
    // TODO: Implement a custom hash map from scratch

    // Pseudo code:
    // - Define an inner Node class for key-value pairs
    // - Use an array of linked lists (buckets) to handle collisions
    // - Implement a simple hash function
    // - put(K key, V value): compute hash, get bucket index, traverse list to find/update or add new node
    // - get(K key): compute hash, get bucket, traverse to find key and return value
    // - remove(K key): similar to get, but remove the node if found
    // - Handle resizing when load factor exceeds threshold
    // - Implement size, isEmpty methods

    // Inner class for entries
    private static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node<K, V>[] buckets;
    private int size;
    private static final int INITIAL_CAPACITY = 16;
    private static final float LOAD_FACTOR = 0.75f;

    @SuppressWarnings("unchecked")
    public CustomHashMap() {
        buckets = new Node[INITIAL_CAPACITY];
        size = 0;
    }

    // TODO: Implement methods
}