package com.learning.helloWorld;

public class HelloWorld2 {

    // 1. hello world 5 times print
    // 2. 1- 100 total sum
    // 3. 1 - 100 odd numbers sum, even numbers sum print
    // 4. 1 -100 prime numbers print

    public static void main(String[] args) {
        // 1. hello world 5 times print
        for (int i = 0; i < 5; i++) {
               System.out.println("Hello World");
        }
        System.out.println();


        // 2. 1- 100 total sum
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        //  System.out.println("sum of numbers from 1 - 100 = " + sum);
        //  System.out.println();

        //1 - 100 odd numbers sum, even numbers sum print
        int oddNumberSum = 0;
        int evenNumberSum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                oddNumberSum += i;
            } else {
                evenNumberSum += i;
            }
        }
        // System.out.println("sum of odd numbers from 1 - 100 = " + oddNumberSum);
        //System.out.println();
        //System.out.println("sum of even numbers from 1 - 100 = " + evenNumberSum);
        //System.out.println();


        // 4. 1 -100 prime numbers print
        int j;
        int number=0;
        System.out.println("prime number between 1 to 100");
        for (int i = 2; i <= 100; i++) {
            for (j = 1; j <= i; j++) {
                if (i % j == 0) {
                    number++;
                }
            }
            if (number == 2) {

                System.out.print("  " + i);
            }
            number = 0;
        }
    }
}




