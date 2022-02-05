package com.learning.usingGenerics;

import java.util.ArrayList;
import java.util.HashMap;

public class GenericsBasics {
    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<String>(); //defining specific data type in <diamond braces>
        strings.add("cat");
        strings.add("dog");
        strings.add("pig");

        String animal = strings.get(1); // index number is mentioned
        System.out.println(animal);
        System.out.println(" ");
        System.out.println(strings); //arraylist is printed
        System.out.println(" ");
        //another method to get all strings one by one
        for (Object result : strings){
            System.out.println(result);

        }


        /////there can be more than one type argument/////it is called hashmaps

        HashMap<String, Integer> map = new HashMap<String, Integer>();

    }
}
