package com.learning.interfacesExample;
//An interface is a fully abstract class. It includes a group of abstract methods (methods without a body).
//We use the interface keyword to create an interface in Java.


interface Info {
        public void showInfo();
    }

/*
Here,
Info is an interface.
It includes abstract method: showInfo();.
Like abstract classes, we cannot create objects of interfaces.
To use an interface, other classes must implement it. We use the "implements" keyword to implement an interface.
e.g : public class Machine implements Info {}
In the above example, we have created an interface named Info. The interface contains an abstract method showInfo().

Here, the Machine class implements Info. And, provides the implementation of the showInfo() method.


*/

