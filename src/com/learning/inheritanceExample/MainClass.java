package com.learning.inheritanceExample;

import com.learning.classesAndObjects.Animals;

import com.learning.polymorphism.Plant;

public class MainClass {
    public static void main(String[] args) {
        Machine machine1 = new Machine();//call class machine from another class by creating object/instance
        machine1.start();
        machine1.stop();

        // accessing class car methods

        Car car1 = new Car();
        car1.start();
        car1.run();
        car1.stop();

        //to use class methods present in another package we need to import it, import package name.class name;
        // e.g: importing class Animals from classesAndObjects package, import com.learning.classesAndObjects.Animals;

        Animals animal6 = new Animals();
        animal6.setName("dog");
        animal6.speak();

        Plant plant2 =new Plant();
        plant2.grow();
    }
}
