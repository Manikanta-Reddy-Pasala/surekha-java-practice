package com.learning.loopsCoding;

public class TestOddEvenPrimeNumbers {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //for loop
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i] + " is even number");
            } else {
                System.out.println(numbers[i] + " is odd number");
            }
        }
        System.out.println("-----------------");

        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i] + " is even number");
            } else {
                System.out.println(numbers[i] + " is odd number");
            }
        }
        System.out.println("-----------------");

        //foreach loop
        for (int i : numbers) {
            if (i % 2 == 0) {
                System.out.println(i + " is even number");
            } else {
                System.out.println(i + " is odd number");
            }
            i++;
        }
        System.out.println("-----------------");

        // while loop
        int i = 0;
        while (i < numbers.length) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i] + " is even number");
            } else {
                System.out.println(numbers[i] + " is odd number");
            }
            i++;
        }
        System.out.println("-----------------");

        //do while loop
        i=0;
        do {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i] + " is even number");
            } else {
                System.out.println(numbers[i] + " is odd number");
            }
            i++;
        }
        while (i < numbers.length);
        System.out.println("-----------------");



         for(i=0; i<=100; i++){

         }
    }
}


