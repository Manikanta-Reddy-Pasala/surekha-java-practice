package com.learning.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListBasics {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        //adding to the list or creating list
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        //another method of creating Array list
        List<Integer> anotherNumbers = Arrays.asList(10,20,30);
        //print each element to the console using method references
        anotherNumbers.forEach(System.out::println);
        System.out.println("    ");


        // retrieving the particular index number by get method
        System.out.println(numbers.get(0));
        //retrieving the total array list using for loop
        System.out.println("getting total length #iteration 1");
        for (int i = 0; i < numbers.size(); i++) {//instead of numbers.length use numbers.size
            System.out.println(numbers.get(i));
        }

        //removing numbers from the array list
        System.out.println("removing numbers from the array list");
        numbers.remove(numbers.size() - 1);// removing last or middle index is fast process
        //removing first index is slow process as it needs to replace the positions of all the next numbers in the list
        numbers.remove(0);

        //retrieving the total array list using for each loop
        System.out.println("getting total length #iteration 2");
        for (Integer totalList : numbers) {
            System.out.println(totalList);//above we removed index 2 & index 0, hence only middle element gets printed
        }

        // List interface

        List<String> anyVariableName = new ArrayList<String>();

    }
    /*
ArrayList provides us with dynamic arrays in Java. Though, it may be slower than standard arrays but can be helpful in
programs where lots of manipulation in the array is needed. The size of an ArrayList is increased automatically if the
collection grows or shrinks if the objects are removed from the collection. Java ArrayList allows us to randomly access
the list. ArrayList can not be used for primitive types, like int, char, etc. We will need a wrapper class for such cases.
The elements in an ArrayList can be accessed directly and efficiently by using the get() and set() methods, since
ArrayList is implemented based on an array. ArrayList is typically used in implementations as implementation class for
the List interface.
Adding & removing elements from the end or near the end is fast process in ArrayList whereas adding & removing elements
in the start or middle is faster in linkedList because in ArrayList index is set to each element and during adding or removing
all elements index position is changed.

LinkedList class is an implementation of the LinkedList data structure which is a linear data structure where the elements
are not stored in contiguous locations and every element is a separate object with a data part and address part.
The elements are linked using pointers and addresses. Each element is known as a node.
In LinkedLists there is link to pre- & post-element E.G: [0] <- [1] -> [2] hence add/remove in start/middle is fast process

LinkedList is implemented as a double linked list. Its performance on add() and remove() is better than the performance
of Arraylist. The get() and set() methods have worse performance than the ArrayList, as the LinkedList does not provide
direct access to its members.



     */
}
