package com.learning.classesAndObjects;

public class ExampleOfClassesAndMethods {

        public static void main(String[] args) {
            Animals animals = new Animals();
            animals.name = "dog";
            animals.age = 2;
            System.out.println(animals.name);
            animals.speak(); //method 1 calling
            //method 2 calling with direct return value
            int yearsLeft = animals.calculateYearsToRetirement();
            System.out.println("Years To Retirement: " + yearsLeft);
            //getting name and age by calling get method
            int animalAge = animals.getAge(); // get method calling
            System.out.println(animalAge);

            String animalName = animals.getName(); // get method calling
            System.out.println(animalName);

        }

    }




