package com.learning.loopsCoding;

public class TestLoops2 {
    public static void main(String[] args) {
        String[] strings = {"laptop", "chair", "mobile", "ipad", "iphone"};
        //for loop
        for (int i = 0; i < strings.length; i++) {

            if (strings[i] == "chair") {
                System.out.println(strings[i]+" = non electronic device");
            } else {
                System.out.println(strings[i]+" = electronic device");
            }
        }
           System.out.println("-----------");

        //for each loop
        for (String i : strings) {
            if (i == "chair") {
                System.out.println(i+" = non electronic device");
            } else {
                System.out.println(i+" = electronic device");
            }

        }
        System.out.println("-----------");
        //while loop

        int i = 0;
        while (i < strings.length) {
            if (strings[i] == "chair") {
               System.out.println(strings[i] + " = non electronic device");
            } else {
               System.out.println(strings[i] + " = electronic device");
            }
            i++;
        }
        System.out.println("-----------");
        //do while loop

        i = 0;
        do {
            if (strings[i] == "chair") {
                System.out.println(strings[i] + " = non electronic device");
            } else {
                System.out.println(strings[i] + " = electronic device");
            }
            i++;
        }
        while (i < strings.length);
        System.out.println("-----------");
    }
}







