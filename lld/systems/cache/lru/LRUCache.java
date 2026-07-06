package lld.systems.cache.lru;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/*
    *
    * Design and Implement an LRU (Least Recently Used) Cache.
    *
    * The cache has a fixed capacity.
    *
    * When the cache reaches its maximum capacity:
    *      - Inserting a new key should evict the Least Recently Used (LRU) entry.
    *
    * Operations to support:
    *
    *      put(K key, V value)
    *          - Insert a new key-value pair.
    *          - If the key already exists, update its value.
    *          - Mark the key as the most recently used.
    *
    *      get(K key)
    *          - Return the value associated with the key.
    *          - Return null (or -1) if the key does not exist.
    *          - Accessing a key makes it the most recently used.
    *
    *      containsKey(K key)
    *          - Returns true if the key exists.
    *
    *      size()
    *          - Returns the current number of entries.
    *
    *      isEmpty()
    *          - Returns whether the cache is empty.
    *
    * Constraints:
    *
    *      - Capacity is fixed during cache creation.
    *      - Duplicate keys are not allowed.
    *      - Both get() and put() should work in O(1) time.
    *
    * Expected Time Complexity:
    *
    *      get()          O(1)
    *      put()          O(1)
    *      containsKey()  O(1)
    *      size()         O(1)
    *
    * Example:
    *
    *      LRUCache<Integer, String> cache = new LRUCache<>(2);
    *
    *      put(1, "A")
    *      put(2, "B")
    *
    *      get(1)         // returns "A"
    *
    *      put(3, "C")
    *
    *      // Key 2 should be evicted because it is the Least Recently Used.
    *
    *      get(2)         // returns null
    *
*/

class Node<K,V> {

    K key;
    V value;
    Node<K,V> next;
    Node<K,V> prev;

    public Node(K key, V value) {
        this.key = key;
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}

public class LRUCache<K,V> {

    private Map<K,Node<K,V>> cache = new HashMap<>();
    private int capacity;
    private Node<K,V> head;
    private Node<K,V> tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = null;
        tail = null;
    }

    public void put(K key, V value) {
        Node<K,V> node;
        if(containsKey(key)) {
            node = cache.get(key);
            node.value = value;
            removeNode(node);
        }
        else {
            node = new Node(key, value);
            if(cache.size() == this.capacity) {
                cache.remove(head.key);
                removeNode(head);
            }
            cache.put(key, node);
        }
        addLast(node);
    }

    public Optional<V> get(K key) {

        if(containsKey(key)) {
            Node<K,V> node = cache.get(key);
            removeNode(node);
            addLast(node);
            return Optional.of(node.value);
        }

        return Optional.empty();
    }

    public boolean containsKey(K key) {
        return cache.containsKey(key);
    }

    public int getSize() {
        return cache.size();
    }

    public boolean isEmpty() {
        return cache.size() == 0;
    }

    private void addLast(Node<K,V> node) {
        if(head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.prev = tail;
        node.next = null;
        tail = node;
    }

    private void removeNode(Node<K,V> node) {
        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        if(head == node) {
            head = head.next;
            head.prev = null;
            return;
        }

        if(tail == node) {
            tail = tail.prev;
            tail.next = null;
            return;
        }

        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public static void main(String[] args) {

        LRUCache<Integer, String> cache = new LRUCache<>(2);

        System.out.println("===== Insert 1=A =====");
        cache.put(1, "A");
        System.out.println("Size: " + cache.getSize());

        System.out.println("\n===== Insert 2=B =====");
        cache.put(2, "B");
        System.out.println("Size: " + cache.getSize());

        System.out.println("\n===== Get 1 =====");
        System.out.println(cache.get(1));      // Optional[A]

        System.out.println("\n===== Insert 3=C (should evict 2) =====");
        cache.put(3, "C");

        System.out.println("Get 2: " + cache.get(2));   // Optional.empty
        System.out.println("Get 1: " + cache.get(1));   // Optional[A]
        System.out.println("Get 3: " + cache.get(3));   // Optional[C]

        System.out.println("\n===== Update 1=AA =====");
        cache.put(1, "AA");

        System.out.println("Get 1: " + cache.get(1));   // Optional[AA]

        System.out.println("\n===== Insert 4=D (should evict 3) =====");
        cache.put(4, "D");

        System.out.println("Get 3: " + cache.get(3));   // Optional.empty
        System.out.println("Get 4: " + cache.get(4));   // Optional[D]
        System.out.println("Get 1: " + cache.get(1));   // Optional[AA]

        System.out.println("\n===== Final Size =====");
        System.out.println(cache.getSize());

        System.out.println("\n===== Is Empty =====");
        System.out.println(cache.isEmpty());
    }
}
