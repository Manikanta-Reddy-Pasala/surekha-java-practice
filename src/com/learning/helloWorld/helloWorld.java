package com.learning.helloWorld;

public class helloWorld {


    public static void main(String[] args) {

        String[] names = {"mani", "aadhya"};

        for(String name : names) {
            String returnedValue = getName(name);
            System.out.println(returnedValue);
        }
    }

    public static String getName(String name) {
        return "hello " + name ;
    }
}
