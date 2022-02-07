package com.learning.abstractClass;

public class Car extends Machine{
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void run() {
        System.out.println("Car running");
    }
}
