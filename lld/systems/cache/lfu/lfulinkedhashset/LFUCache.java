package lld.systems.cache.lfu.lfulinkedhashset;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/*
 *
 * Design and Implement an LFU (Least Frequently Used) Cache.
 *
 * Supports:
 *
 *      get(key)
 *      put(key, value)
 *
 * Eviction Policy:
 *
 *      1. Remove the Least Frequently Used key.
 *      2. If multiple keys have the same frequency,
 *         remove the Least Recently Used among them.
 *
 * Time Complexity:
 *
 *      get()      O(1)
 *      put()      O(1)
 *
 */

public class LFUCache {

    private final Map<Integer, Integer> keyValueMap;
    private final Map<Integer, Integer> keyFreqMap;
    private final Map<Integer, Set<Integer>> freqMap;

    private final int capacity;
    private int minFrequency;

    public LFUCache(int capacity) {

        this.capacity = capacity;

        keyValueMap = new HashMap<>();
        keyFreqMap = new HashMap<>();
        freqMap = new HashMap<>();

        minFrequency = 0;
    }

    public int get(int key) {

        if (!keyValueMap.containsKey(key)) {
            return -1;
        }

        int freq = keyFreqMap.get(key);

        keyFreqMap.put(key, freq + 1);

        freqMap.get(freq).remove(key);

        if (freq == minFrequency && freqMap.get(freq).isEmpty()) {
            minFrequency++;
        }

        freqMap.putIfAbsent(freq + 1, new LinkedHashSet<>());
        freqMap.get(freq + 1).add(key);

        return keyValueMap.get(key);
    }

    public void put(int key, int value) {

        if (capacity == 0) {
            return;
        }

        if (keyValueMap.containsKey(key)) {

            keyValueMap.put(key, value);
            get(key);                  // update frequency
            return;
        }

        if (keyValueMap.size() == capacity) {

            Set<Integer> list = freqMap.get(minFrequency);

            int evictKey = poll(list);

            keyValueMap.remove(evictKey);
            keyFreqMap.remove(evictKey);
        }

        keyValueMap.put(key, value);
        keyFreqMap.put(key, 1);

        freqMap.putIfAbsent(1, new LinkedHashSet<>());
        freqMap.get(1).add(key);

        minFrequency = 1;
    }

    private int poll(Set<Integer> set) {

        Iterator<Integer> iterator = set.iterator();

        int key = iterator.next();

        iterator.remove();

        return key;
    }

    public void printState() {

        System.out.println("Key -> Value : " + keyValueMap);
        System.out.println("Key -> Freq  : " + keyFreqMap);
        System.out.println("Freq -> Keys : " + freqMap);
        System.out.println("Min Frequency: " + minFrequency);
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {

        LFUCache cache = new LFUCache(2);

        System.out.println("put(1,10)");
        cache.put(1, 10);
        cache.printState();

        System.out.println("put(2,20)");
        cache.put(2, 20);
        cache.printState();

        System.out.println("get(1) = " + cache.get(1));
        cache.printState();

        System.out.println("put(3,30)");
        cache.put(3, 30);
        cache.printState();

        System.out.println("get(2) = " + cache.get(2));
        System.out.println("get(3) = " + cache.get(3));
        cache.printState();

        System.out.println("get(3) = " + cache.get(3));
        cache.printState();

        System.out.println("put(4,40)");
        cache.put(4, 40);
        cache.printState();

        System.out.println("get(1) = " + cache.get(1));
        System.out.println("get(3) = " + cache.get(3));
        System.out.println("get(4) = " + cache.get(4));
    }
}