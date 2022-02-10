package com.learning.collections;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
/*
The Java Queue interface, java.util.Queue represents a data structure designed to have elements inserted at the end of
the queue, and elements removed from the beginning of the queue. This is similar to how a queue in a supermarket works.
The Java Queue interface is a subtype of the Java Collection interface. It represents an ordered sequence of objects
just like a Java List, but its intended use is slightly different.

Java Queue Implementations:
Since Queue is an interface you need to instantiate a concrete implementation of the interface in order to use it.
You can choose between the following Queue implementations in the Java Collections API:

1.java.util.LinkedList: LinkedList is a pretty standard queue implementation. Elements in the queue are stored internally
in a standard linked list data structure. This makes it fast to insert elements at the end (tail) of the list, and remove
 elements from the beginning (head) of the list.

2.java.util.PriorityQueue: PriorityQueue stores its elements internally according to their natural order (if they
implement Comparable), or according to a Comparator passed to the PriorityQueue.

3.ArrayDeque

In most Queue implementations the head and tail of the queue are at opposite ends. It is possible, however, to implement
the Queue interface so that the head and tail of the queue is in the same end. In that case you would have a stack.

 */

public class Queues {
    public static void main(String[] args) {
        // (take here) (head) <- oooooooooooooooooooooooo <- (tail) (insert here) FIFO (first in, first out)
        //ArrayBlockingQueue has limited capacity unlike LinkedLists
        Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);

        // Throws NoSuchElement exception --- no items in queue yet
        // System.out.println("Head of queue is: " + q1.element());
/*
Add Element to Queue:
we have 2 methods to add elements to a Queue. They are the add() method and the offer() method. These 2 methods add an
element to the end of the Queue. The add() and offer() methods differ in how they behave if the Queue is full, so no more
elements can be added. The add() method throws an exception in that case, whereas the offer() method just returns false.
 */
        //add() method, offer method is below
        q1.add(10);
        q1.add(20);
        q1.add(30);
/*
Peek at the Queue:
You can peek at the element at the head of a Queue without taking the element out of the Queue. This is done via the
Queue element() or peek() methods. The element() method returns the first element in the Queue. If the Queue is empty,
the element() method throws a NoSuchElementException. The peek() works like the element() method except it does not throw
an exception if the Queue is empty. Instead, it just returns null.
 */
        //element() method,peek() method is below
        System.out.println("Head of queue is: " + q1.element());
        try {
            q1.add(40);
        } catch (IllegalStateException e) {
            System.out.println("Tried to add too many items to the queue.");
        }
        for (Integer value : q1) {
            System.out.println("Queue value: " + value);
        }
/*
Take Element From Queue:
To take an element from a Java Queue you can call either its poll() or remove() method. The poll() and remove() both
removes the first element in the Queue. They differ in how they behave if the Queue is empty. The poll() method returns
null if the Queue is empty. The remove() method throws an exception if the Queue is empty.
 */
        //remove() method, poll() method is below
        System.out.println("Removed from queue: " + q1.remove());
        System.out.println("Removed from queue: " + q1.remove());
        System.out.println("Removed from queue: " + q1.remove());
        try {
            System.out.println("Removed from queue: " + q1.remove());
        } catch (NoSuchElementException e) {
            System.out.println("Tried to remove too many items from queue");
        }
        ////////////////////////////////////////////////////////////////////
        Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);

        //peek() method
        System.out.println("Queue 2 peek: " + q2.peek());

        //offer method
        q2.offer(10);
        q2.offer(20);
        //peek() method
        System.out.println("Queue 2 peek: " + q2.peek());

        if (q2.offer(30) == false) {
            System.out.println("Offer failed to add third item.");
        }
        for (Integer value : q2) {
            System.out.println("Queue 2 value: " + value);
        }

        //poll() method
        System.out.println("Queue 2 poll: " + q2.poll());
        System.out.println("Queue 2 poll: " + q2.poll());
        System.out.println("Queue 2 poll: " + q2.poll());
    }

}
/*
Sub-interfaces:
Generally, the Queue interface is inherited by 3 main sub-interfaces.

1.Blocking Queues:The BlockingQueue interface supports additional operations which force threads to wait on the Queue
depending on the current state. A thread may wait on the Queue to be non-empty when attempting a retrieval, or for it to
become empty when adding a new element.
Standard Blocking Queues include LinkedBlockingQueue, SynchronousQueue, and ArrayBlockingQueue.

2.Transfer Queues:The TransferQueue interface extends the BlockingQueue interface but is tailored toward the producer-
consumer pattern. It controls the flow of information from producer to consumer, creating backpressure in the system.
Java ships with one implementation of the TransferQueue interface, LinkedTransferQueue.

3.Deques:Deque is short for Double-Ended Queue and is analogous to a deck of cards – elements may be taken from both the
start and end of the Deque. Much like the traditional Queue, the Deque provides methods to add, retrieve and peek at
elements held at both the top and bottom.
 */


