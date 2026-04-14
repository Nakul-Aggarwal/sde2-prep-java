package dsa.linkedlist.implementation;

import java.util.LinkedList;

/*
 * Collections LinkedList operations
    * 1. Adding Elements
        * - add(Object): Appends the specified element to the end of this list.
        * - add(int index, Object): Inserts the specified element at the specified position in this list.
    * 2. Update Elements
        * - set(int index, Object): Replaces the element at the specified position in this list with the specified element.
    * 3. Removing Elements
        * - remove(Object): Removes the first occurrence of the specified object from the LinkedList.
        * - remove(int index): Removes the element at the given index and shifts subsequent elements.
    * 4. Accessing Elements
        * - get(int index): Returns the element at the specified position in this list.
    * 5. All Remaining operations:
        * - addAll(Collection<E> c): Appends all elements of collection to end.
        * - addAll(int index, Collection<E> c): Inserts all elements of collection starting at index.
        * - addFirst(E e): Inserts the specified element at the beginning of this list.
        * - addLast(E e): Appends the specified element to the end of this list.
        * - clear(): Removes all of the elements from this list.
        * - clone(): Returns a shallow copy of this LinkedList.
        * - contains(Object o): Returns true if this list contains the specified element.
        * - descendingIterator(): Returns an iterator over the elements in reverse sequential order.
        * - element(): Retrieves but does not remove, the head (first element) of this list.
        * - getFirst(): Returns the first element in this list.
        * - getLast(): Returns the last element in this list.
        * - indexOf(Object o): Returns first index of element or -1 if element is not present.
        * - lastIndexOf(Object o): Returns last index of element or -1 if element is not present.
        * - listIterator(int index): Returns a list-iterator of the elements.
        * - offer(E e): Adds the specified element as the tail (last element) of this list.
        * - offerFirst(E e): Inserts the specified element at the front of this list.
        * - offerLast(E e): Inserts the specified element at the end of this list.
        * - peek(): Retrieves but does not remove, the head (first element) of this list.
        * - peekFirst(): Retrieves, but does not remove, the first element or returns null if empty.
        * - peekLast(): Retrieves, but does not remove, the last element or returns null if empty.
        * - poll(): Retrieves and removes the head (first element) of this list.
        * - pollFirst(): Retrieves and removes the first element or returns null if empty.
        * - pollLast(): Retrieves and removes the last element or returns null if empty.
        * - pop(): Pops an element from the stack represented by this list.
        * - push(E e): Pushes an element onto the stack represented by this list.
        * - remove(): Retrieves and removes the head (first element) of this list.
        * - removeFirst(): Removes and returns the first element from this list.
        * - removeFirstOccurrence(Object o): Removes the first occurrence of the specified element.
        * - removeLast(): Removes and returns the last element from this list.
        * - removeLastOccurrence(Object o): Removes the last occurrence of the specified element.
        * - size(): Returns the number of elements in this list.
        * - spliterator(): Creates a late-binding and fail-fast Spliterator over the elements.
        * - toArray(): Returns an array containing all elements in this list.
        * - toArray(T[] a): Returns array of all elements in given type.
        * - toString(): Returns string representation of list.
*/

public class CollectionsLL {
    public static void main (String args[]) {
    
        LinkedList<String> list = new LinkedList<String>();
        list.add("is");
        list.add("a");
        list.addLast("list");
        list.addFirst("this");
        list.add(3, "linked");
        System.out.println(list);


        System.out.println(list.get(0));
        System.out.println(list.size());   
        list.remove(3);
        list.removeFirst();
        list.removeLast();
        
        System.out.println(list);

    }
}
