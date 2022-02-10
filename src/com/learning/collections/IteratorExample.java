package com.learning.collections;

import java.util.Iterator;
import java.util.LinkedList;
/*
The Iterator Interface:
An Iterator is one of many ways we can traverse a collection, and as every option, it has its pros and cons.
It was first introduced in Java 1.2 as a replacement of Enumerations and:
-introduced improved method names
-made it possible to remove elements from a collection we're iterating over
-doesn't guarantee iteration order

To use an Iterator, you must import it from the java.util package.
To start, we need to obtain an Iterator from a Collection; this is done by calling the iterator() method.e.g:
List<String> items = ...
Iterator<String> iter = items.iterator();

The Iterator interface has three core methods:
1.The hasNext() method can be used for checking if there's at least one element left to iterate over.It's designed to be
used as a condition in while loops:e.g:
while (iter.hasNext()) {
    // ...
}
2.The next() method can be used for stepping over the next element and obtaining it. Returns the next element in the list
& advances the cursor position. This method may be called repeatedly to iterate through the list, or intermixed with calls
to previous() to go back and forth.e.g:String next = iter.next();

3.remove() method: if we want to remove the current element from the collection, we can use the remove:iter.remove();
This is a safe way to remove elements while iterating over a collection without a risk of a ConcurrentModificationException.

The Iterator interface allows us to modify a collection while traversing it, which is more difficult with a simple
for/while statement. This, in turn, gives us a good pattern we can use in many methods that only requires collections
processing while maintaining good cohesion and low coupling.
 */

public class IteratorExample {
    public static void main(String[] args) {
        LinkedList<String> animalsList = new LinkedList<>();
        animalsList.add("whale");
        animalsList.add("donkey");
        animalsList.add("zebra");
        animalsList.add("mouse");
        //calling the iterator() method.

        Iterator<String> iter = animalsList.iterator();

        while (iter.hasNext()) {
            String value = iter.next();
            System.out.println(value);

            if (value.equals("zebra")) { //remove method while iterating through the loop
                iter.remove();
            }
            System.out.println("  ");

            //modern iteration after java 5
            for (String allAnimals : animalsList) {
                System.out.println(allAnimals);
            }
        }
    }
}
