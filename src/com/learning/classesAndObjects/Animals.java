package com.learning.classesAndObjects;

public class Animals {
    String name;
    int age;

    //method 1
    public void speak() {
        System.out.println("My name is " + name);
    }

    //method 2 . using return
    public int calculateYearsToRetirement() { // no void is used & mention what data type to be returned like int/String/double.
        int yearsToRetirement = 20 - age;
        return yearsToRetirement;

    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

}
