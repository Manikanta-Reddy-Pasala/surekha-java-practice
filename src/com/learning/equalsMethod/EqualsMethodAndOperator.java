package com.learning.equalsMethod;

public class EqualsMethodAndOperator {
    public static void main(String[] args) {
        /*
Both equals() method and the == operator are used to compare two objects in Java.

Whenever we create an object using the operator new, it will create a new memory location for that object. So we use
the == operator to check memory location or address of two objects are the same or not.

Here are some of the differences between the two:
1. .equals() is a method and == is an operator.
2.We can use == operators for reference comparison (address comparison) and .equals() method for content comparison.
In simple words, == checks if both objects point to the same memory location whereas .equals() evaluates to the comparison
of values in the objects.
3.If a class does not override the equals() method, then by default, it uses the equals(Object o) method of the closest
parent class that has overridden this method.
         */
        String s1 = "HELLO";
        String s2 = "HELLO";
        String s3 =  new String("HELLO");

        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false, s3 is new object hence different memory location
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        System.out.println("     ");
/*
Equality operator(==)
We can apply equality operators for every primitive type, including the boolean type.
 */
        System.out.println(10 == 20);  // integer-type
        System.out.println('a' == 'b'); // char-type
        System.out.println('a' == 97.0); // char and double type
        System.out.println(true == true); // boolean type
        System.out.println("     ");
/*
If we apply == for object types then, there should be compatibility between arguments types (either child to parent
or parent to child or same type). Otherwise, we will get a compile-time error.
 */
        Thread t = new Thread();
        Object o = new Object();
        String s = new String("GEEKS");

        System.out.println(t == o);
        System.out.println(o == s);
        System.out.println("     ");

        // Uncomment to see error
        //System.out.println(t==s);
/*
.equals() Method
In Java, the String equals() method compares the two given strings based on the data/content of the string. If all the
contents of both the strings are the same, it returns true. If all characters are not matched, then it returns false.
 */
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = t1;

        String x1 = new String("GEEKS");
        String x2 = new String("GEEKS");

        System.out.println(t1 == t3);
        System.out.println(t1 == t2);
        System.out.println(x1 == x2);

        System.out.println(t1.equals(t2));
        System.out.println(x1.equals(x2));

    }
}
