package com.learning.loopsCoding;

public class TestLoops {
    public static void main(String[] args) {

        String[] animals = {"cat", "rat", "tiger", "dog"};

        forLoop(animals);
        forEach(animals);
        whileLoop(animals);
        doWhileLoop(animals);

    }

    //for loop
    public static void forLoop(String[] animals1) {
        for (int i = 0; i < animals1.length; i++) {
            System.out.println(animals1[i]);
        }
        System.out.println("--------");
    }

    //for each loop
    public static void forEach(String[] animals) {
        for (String i : animals) {
            System.out.println(i);

        }
        System.out.println("---------");
    }

    //while loop
    public static void whileLoop(String[] animals) {
        int i = 0;
        while (i < animals.length) {
            System.out.println(animals[i]);
            i++;

        }
        System.out.println("---------");
    }

    //do while loop
    public static void doWhileLoop(String[] animals) {
        int i = 0;
        do {
            System.out.println(animals[i]);
            i++;
        }
        while (i < animals.length);
        System.out.println("---------");

    }
}


