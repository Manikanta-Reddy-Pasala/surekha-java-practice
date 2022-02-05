package com.learning.inheritanceExample;

public class Car extends Machine{ // Extends = now car is a child of machine it inherits all methods of machine and
    // any additional methods we can write, or we can even override from machine method using right click & override.

    public void start(){
        System.out.println("Car started");
    }
    public void stop(){
        System.out.println("Car stopped");
    }
    public void run(){
        System.out.println("Car Running");
    }
}
