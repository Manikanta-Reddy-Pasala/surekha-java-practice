package com.learning.stringBuildingAndFormatting;

public class StringBuildingExample {
    public static void main(String[] args) {
        //inefficient method
        String info = "";
        info += "My name is Aadhya. ";
        info += "I am 6 years old ";
        System.out.println(info);


        // more efficient method
        StringBuilder sb = new StringBuilder();
        sb.append("My name is Surekha. ");
        sb.append("I am 31 years old "); //from second line we can simply use .append instead of sb.append
        System.out.println(sb);


        ////////Formatting////////
        // " \t is a tab, \n is a new line. e.g below
        System.out.println("my name is\tSurekha\nnew line");
        //formatting character printf = %d (for number), argument e.g:
        //  %d (for number),%s (for string) , %f (floating point), %.2f (.1,.2,.3 decimal places), %3.1f(number before
        //  point indicates total number of digits including point)
        System.out.printf("total cost %d\n,quantity %d\n", 5, 100);


        System.out.println(String.format("%d", 5));


    }
}