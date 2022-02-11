package com.learning.testKnowledge;

import java.util.Scanner;

public class InteractiveProgramme {
    public static void main(String[] args) {
       // int number = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the number");

        int number = scanner.nextInt();

        if(number<10){
            System.out.println("number is small");
        }
        else if(number>=10){
            System.out.println("number is big enough");
        }
    }
}
