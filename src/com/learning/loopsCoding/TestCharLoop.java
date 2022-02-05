package com.learning.loopsCoding;

public class TestCharLoop {

    public static void main(String... args) {
        char[] alphabets = {'a', 'b', 'c'};
        // for loop
        for (int i = 0; i < alphabets.length; i++) {
            System.out.println(alphabets[i]);
        }
        System.out.println();

        //for each loop
        for (char i : alphabets) {
            System.out.println(i);
            i++;
        }
        System.out.println();

        //do while loop

        int i = 0;
        do {
            System.out.println(alphabets[i]);
            i++;
        }
        while (i < alphabets.length);

        System.out.println();

        //while loop
        i = 0;
        while (i < alphabets.length) {
            System.out.println(alphabets[i]);
            i++;
        }
        System.out.println();
    }
}
