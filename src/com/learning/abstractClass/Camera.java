package com.learning.abstractClass;

public class Camera extends Machine{
    @Override
    public void start() {
        System.out.println("Camera started");
    }

    @Override
    public void run() {
        System.out.println("Camera running");
    }
}
