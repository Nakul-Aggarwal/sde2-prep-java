package dsa.arrayList.implementation;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Collections ArrayList operations
    * 1. Adding Elements
        * - add(E e): Appends the specified element to the end of this list.
        * - add(int index, E element): Inserts the specified element at the specified position in this list.
        * - addAll(Collection<? extends E> c): Appends all of the elements in the specified collection to the end of this list.
        * - addAll(int index, Collection<? extends E> c): Inserts all of the elements in the specified collection into this list, starting at the specified position.
    * 2. Update Elements
        * - set(int index, E element): Replaces the element at the specified position in this list with the specified element.
        * - replaceAll(UnaryOperator<E> operator): Replaces each element of this list with the result of applying the operator to that element.
    * 3. Removing Elements
        * - remove(int index): Removes the element at the specified position in this list.
        * - remove(Object o): Removes the first occurrence of the specified element from this list, if it is present.
        * - removeAll(Collection<?> c): Removes from this list all of its elements that are contained in the specified collection.
        * - removeIf(Predicate<? super E> filter): Removes all of the elements of this list that satisfy the given predicate.
        * - clear(): Removes all of the elements from this list.
    * 4. Accessing Elements
        * - get(int index): Returns the element at the specified position in this list.
        * - indexOf(Object o): Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
        * - lastIndexOf(Object o): Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
        * - subList(int fromIndex, int toIndex): Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.
    * 5. All Remaining operations:
        * - size(): Returns the number of elements in this list.
        * - isEmpty(): Returns true if this list contains no elements.
        * - contains(Object o): Returns true if this list contains the specified element.
        * - toArray(): Returns an array containing all of the elements in this list in proper sequence.
        * - toArray(T[] a): Returns an array containing all of the elements in this list in proper sequence; the runtime type of the returned array is that of the specified array.
        * - clone(): Returns a shallow copy of this ArrayList instance.
        * - ensureCapacity(int minCapacity): Increases the capacity of this ArrayList instance, if necessary, to ensure that it can hold at least the number of elements specified by the minimum capacity argument.
        * - forEach(Consumer<? super E> action): Performs the given action for each element of the Iterable until all elements have been processed or the action throws an exception.
        * - iterator(): Returns an iterator over the elements in this list in proper sequence.
        * - listIterator(): Returns a list iterator over the elements in this list (in proper sequence).
        * - listIterator(int index): Returns a list iterator over the elements in this list (in proper sequence), starting at the specified position in the list.
        * - retainAll(Collection<?> c): Retains only the elements in this list that are contained in the specified collection.
        * - sort(Comparator<? super E> c): Sorts this list according to the order induced by the specified Comparator.
        * - spliterator(): Creates a late-binding and fail-fast Spliterator over the elements in this list.
        * - toString(): Returns a string representation of this collection.
        * - trimToSize(): Trims the capacity of this ArrayList instance to be the list's current size.
*/

public class CollectionsArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<Boolean> list3 = new ArrayList<Boolean>();
        
        //add elements
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);


        //to get an element
        int element = list.get(0); // 0 is the index
        System.out.println(element);


        //add element in between
        list.add(1,2); // 1 is the index and 2 is the element to be added
        System.out.println(list);


        //set element
        list.set(0,0);
        System.out.println(list);


        //delete elements
        list.remove(0); // 0 is the index
        System.out.println(list);


        //size of list
        int size = list.size();
        System.out.println(size);


        //Loops on lists
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();


        //Sorting the list
        list.add(0);
        Collections.sort(list);
        System.out.println(list);
    }
    
}
