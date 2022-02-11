package com.learning.testKnowledge;

import java.util.Scanner;

public class WhileLoopTest {
    public static void main(String[] args) {
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        number = scanner.nextInt();

        while(number != 5){
            System.out.println("enter 5: ");
            number = scanner.nextInt();
        }
        System.out.println("got it");
    }
}

