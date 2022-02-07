package com.learning.enumsExample;
enum Level {
    LOW,MEDIUM,HIGH
}

/*An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).

To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma.
Note that they should be in uppercase letters:

You can access enum constants with the dot syntax: e.g: Level level1 = Level.HIGH;

Use enums when you have values that you know aren't going to change, like month days, days, colors, deck of cards, etc.

In Java, we can also add variables, methods, and constructors to it. The main objective of enum is to define our own
data types(Enumerated Data Types).

Every enum constant is always implicitly public static final. Since it is static, we can access it by using the
enum Name. Since it is final, we can’t create child enums.
*/


