package com.learning.helloWorld;

import java.util.Scanner;

public class MethodCallingExample {
    public static void main(String[] args) {
        
        System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        //double age = scanner.nextDouble();// if double... double name = scanner.nextDouble();
        greetUser(name);

    }

    private static void greetUser(String name) {

        System.out.println("Hi " + name);
        
    }
}
