package com.learning.classesAndObjects;

import java.util.Arrays;

class Person {
    // instance variables (data or "state")
    private String name;
    private int age;

    /* classes can contain

    1. Data
    2. Subroutines (methods)..to study behavior of objects

     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class House {

    private int chairs;
    private int windows;
    private String[] rooms;
    private int numberOfRooms;

    public int getChairs() {
        return chairs;
    }

    public void setChairs(int chairs) {
        this.chairs = chairs;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public String[] getRooms() {
        return rooms;
    }

    public void setRooms(String[] rooms) {
        this.rooms = rooms;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }
}

public class CreatingClassesAndObjects {
    public static void main(String[] args) {

        Person person1 = new Person(); // person1, person2 are objects
        person1.setName("mani");
        person1.setAge(33);

        Person person2 = new Person();
        person2.setName("Aadhya");
        person2.setAge(6);

        System.out.println(person1.getName());
        System.out.println(person2.getAge());


        House house = new House();
        house.setChairs(5);
        house.setNumberOfRooms(3);

        String[] rooms = {"bed", "hall"};
        house.setRooms(rooms);

        System.out.println(house.getChairs());
        System.out.println(Arrays.toString(house.getRooms()));


    }

}
