package com.learning.abstractClass;
//An instance of an abstract class can not be created like Machine machine1 = new Machine ,can't do.
public abstract class Machine {
// Abstract method can only be used in an abstract class, and it does not have a body. The body is provided by the
// subclass (inherited from).
  public abstract void start(); // abstract method without body

  //we can also have regular methods
  public void run(){
    System.out.println("Machine running");
  }
}
