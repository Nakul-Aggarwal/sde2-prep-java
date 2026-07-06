package lld.systems.cache.lfu.lfudoublyll;

import java.util.HashMap;
import java.util.Map;

public class LFUCache<K, V> {

    private final Map<K, Node<K, V>> keyMap;
    private final Map<Integer, DoublyLinkedList<K, V>> freqMap;

    private final int capacity;

    private int currentSize;
    private int minFrequency;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.currentSize = 0;
        this.minFrequency = 0;
        this.keyMap = new HashMap<>();
        this.freqMap = new HashMap<>();
    }

    public V get(K key) {

        Node<K, V> node = keyMap.get(key);

        if (node == null) {
            return null;
        }

        touch(node);

        return node.value;
    }

    public void put(K key, V value) {

        if (capacity == 0) {
            return;
        }

        if (keyMap.containsKey(key)) {

            Node<K, V> node = keyMap.get(key);
            node.value = value;
            touch(node);
            return;
        }

        if (currentSize == capacity) {
            evictLFUNode();
        }

        Node<K, V> node = new Node<>(key, value);

        keyMap.put(key, node);

        DoublyLinkedList<K, V> list =
                freqMap.computeIfAbsent(1, k -> new DoublyLinkedList<>());

        list.addLast(node);

        currentSize++;
        minFrequency = 1;
    }

    private void touch(Node<K, V> node) {

        int oldFrequency = node.frequency;

        DoublyLinkedList<K, V> oldList = freqMap.get(oldFrequency);

        oldList.remove(node);

        if (oldList.isEmpty()) {

            freqMap.remove(oldFrequency);

            if (minFrequency == oldFrequency) {
                minFrequency++;
            }
        }

        node.frequency++;

        DoublyLinkedList<K, V> newList =
                freqMap.computeIfAbsent(node.frequency,
                        k -> new DoublyLinkedList<>());

        newList.addLast(node);
    }

    private void evictLFUNode() {

        DoublyLinkedList<K, V> list = freqMap.get(minFrequency);

        Node<K, V> removedNode = list.deleteHead();

        keyMap.remove(removedNode.key);

        currentSize--;

        if (list.isEmpty()) {
            freqMap.remove(minFrequency);
        }
    }

    public int size() {
        return currentSize;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean containsKey(K key) {
        return keyMap.containsKey(key);
    }

    public static void main(String[] args) {

        LFUCache<Integer, String> cache = new LFUCache<>(2);

        System.out.println("----- Put(1, A) -----");
        cache.put(1, "A");

        System.out.println("----- Put(2, B) -----");
        cache.put(2, "B");

        System.out.println("Get(1): " + cache.get(1));
        // Frequency:
        // 1 -> freq = 2
        // 2 -> freq = 1

        System.out.println("----- Put(3, C) -----");
        cache.put(3, "C");
        // Key 2 should be evicted

        System.out.println("Get(2): " + cache.get(2)); // null
        System.out.println("Get(3): " + cache.get(3)); // C
        System.out.println("Get(1): " + cache.get(1)); // A

        System.out.println();

        System.out.println("----- Update key 3 -----");
        cache.put(3, "Updated C");

        System.out.println("Get(3): " + cache.get(3));

        System.out.println();

        System.out.println("----- Put(4, D) -----");
        cache.put(4, "D");

        System.out.println("Get(1): " + cache.get(1));
        System.out.println("Get(3): " + cache.get(3));
        System.out.println("Get(4): " + cache.get(4));

        System.out.println();

        System.out.println("Current Size: " + cache.size());

        System.out.println("Contains 1: " + cache.containsKey(1));
        System.out.println("Contains 2: " + cache.containsKey(2));
        System.out.println("Contains 3: " + cache.containsKey(3));
        System.out.println("Contains 4: " + cache.containsKey(4));
    }
}