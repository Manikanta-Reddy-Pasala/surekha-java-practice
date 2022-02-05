package com.learning.classesAndObjects;
/*
In Java, a constructor is a block of codes similar to the method. It is called when an instance of the class is created.
It is a special type of method which is used to initialize the object.

Every time an object is created using the new() keyword, at least one constructor is called.

It calls a default constructor if there is no constructor available in the class.
 In such case, Java compiler provides a default constructor by default.

There are two types of constructors in Java: no-arg constructor, and parameterized constructor.

Note: It is called constructor because it constructs the values at the time of object creation.
 It is not necessary to write a constructor for a class. It is because java compiler creates a default constructor
 if your class doesn't have any.

/// Rules for creating Java constructor

-  Constructor name must be the same as its class name
-A Constructor must have no explicit return type
-A Java constructor cannot be abstract, static, final, and synchronized


 */

class Machine{
     String name;
     int code;

    public Machine(){
        this("aadhya",7);//run/call constructor in another constructor

        System.out.println("statement 1");
    }
    public Machine(String name){
        System.out.println("statement 2");
        this.name = name;
    }
    public Machine(String name, int code){
        System.out.println("statement 3");
        this.name = name;
        this.code = code;
    }
}

public class Constructors {
    public static void main(String[] args) {
        Machine machine = new Machine();
        Machine machine1 = new Machine("aadhya");
        Machine machine2 = new Machine("aadhya" , 7);
    }
}
