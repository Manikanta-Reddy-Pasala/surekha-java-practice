package com.learning.collections;
/*
The Java Set interface, java.util.Set, represents a collection of objects where each object in the Java Set is unique.
In other words, the same object cannot occur more than once in a Java Set(duplicate values cannot be stored.). The Java
Set interface is a standard Java interface, and it is a subtype of the Java Collection interface, meaning Set inherits
from Collection.

Java Set vs. List:
The Java Set & Java List interfaces are quite similar to each other. Both interfaces represent a collection of elements.
But there are some significant differences. These differences are reflected in the methods the Set & List interfaces contain.
1. same element cannot occur more than once in a Java Set whereas in Java List each element can occur more than once.
2. elements in a Set has no guaranteed internal order. The elements in a List has an internal order, and the elements
can be iterated in that order.

Set Implementations:
Since Set is an interface, objects cannot be created of the type set. Being a Collection subtype all methods in the
Collection interface are also available in the Set interface.Since Set is an interface you need to instantiate a concrete
implementation of the interface in order to use it. You can choose between the following Set implementations in the Java
Collections API:
1.java.util.EnumSet
2.java.util.HashSet ..HashSet is backed by a HashMap.It doesn't guarantee the sequence of the elements when you iterate them.
3.java.util.LinkedHashSet ... LinkedHashSet differs from HashSet by guaranteeing that the order of the elements during
iteration is the same as the order they were inserted into the LinkedHashSet. Reinserting an element that is already in
the LinkedHashSet does not change this order.
4.java.util.TreeSet ...TreeSet also guarantees the order of the elements when iterated, but the order is the sorting order
of the elements. In other words, the order in which the elements would be sorted if you used a Collections.sort() on a List
or array containing these elements. This order is determined either by their natural order (if they implement Comparable),
or by a specific Comparator implementation.

Each of these Set implementations behaves a little differently with respect to the order of the elements when iterating
the Set, and the time (big O notation) it takes to insert and access elements in the sets.

 */

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        //Set<String> set1 = new HashSet<String>(); // hashset does not retain order
        //Set<String> set1 = new LinkedHashSet<String>(); // LinkedHashSet remembers the order as we added elements
        Set<String> set1 = new TreeSet<String>(); //TreeSet sorts in the natural order of elements

        //checking whether set is empty
        if(set1.isEmpty()){
            System.out.println("Set is empty as elements are not added");
        }
        //adding elements
        set1.add("cat");
        set1.add("lion");
        set1.add("tiger");
        set1.add("whale");
        set1.add("crow");
        set1.add("parrot");
        //adding duplicate items does nothing
        set1.add("cat");
        //accessing
        System.out.println(set1);
        //iterating each element using for loop
        for(String animals : set1){
            System.out.println( animals); // hashset does not retain order
        }
        ///////////does set contain a given item? /////////////////////
        if(set1.contains("rat")){
            System.out.println("set1 contains rat"); //not there so not printed
        }
        if(set1.contains("cat")){
            System.out.println("set1 contains cat");

        }
        //Operations on the Set Interface
        //The set interface allows the users to perform the basic mathematical operation on the set.
        //1. Intersection: This operation returns all the common elements from the given two sets.
        //2.Union: This operation adds all the elements in one set with the other. total elements in both sets are printed
        //3. Difference: This operation removes all the elements present in one set from the other set.
        //////////////// intersection///////////////
        Set<String> set2 = new TreeSet<String>();

        set2.add("cat");
        set2.add("lion");
        set2.add("dog");
        set2.add("shark");
        set2.add("fish");
        set2.add("owl");

        Set<String> intersection = new HashSet<String>(set1);
        intersection.retainAll(set2);// common things are printed
        System.out.println(intersection);
        ////////////////////// Union //////////////////////
        Set<String> union = new HashSet<String>(set1);
        union.addAll(set2);
        System.out.println(union);
        ////////////////// Difference //////////////////
        Set<String> difference = new HashSet<String>(set1);
        difference.removeAll(set2);
        System.out.println(difference);

    }


}
