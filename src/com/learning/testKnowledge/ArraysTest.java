package com.learning.testKnowledge;

public class ArraysTest {
    public static void main(String[] args) {
        float [] floatNumbers = {0.1f, 2.34f, 3.5f, 6.3f, 2.8f};

        System.out.println(floatNumbers[1]);

        for(int i=0; i<floatNumbers.length; i++) {

            System.out.printf(String.format("%.2f \t",floatNumbers[i]));
        }

    }
}
