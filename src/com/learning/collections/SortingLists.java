package com.learning.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Animal {
    private int id;
    private String name;

    public Animal(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return id + ": " + name;
    }
}

//creating comparator to print the elements in string length wise order
class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {//compares s1 & s2
        int len1 = s1.length();//calculating length of each string
        int len2 = s2.length();

        if (len1 > len2) {
            return 1;
        } else if (len1 < len2) {
            return -1;
        }
        return 0;
    }
}

//print the elements in alphabetical order
class AlphabeticalComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s1.compareTo(s2);
    }
}

class ReverseAlphabeticalComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return -s1.compareTo(s2);
    }
}


public class SortingLists {
    public static void main(String[] args) {
        ////////////////////// Sorting Strings ////////////////////////////////
        List<String> animals = new ArrayList<String>();

        animals.add("tiger");
        animals.add("lion");
        animals.add("cat");
        animals.add("snake");
        animals.add("mongoose");
        animals.add("elephant");

        //Collections.sort(animals); // sorts in natural order

        //Collections.sort(animals, new StringLengthComparator()); //to use comparator we need to supply new instance, by
        // this method strings are printed length wise
        //Collections.sort(animals, new ReverseAlphabeticalComparator());
        Collections.sort(animals, new AlphabeticalComparator()); //print the elements in alphabetical order


        for (String animal : animals) {
            System.out.println(animal);
        }

        ////////////////////// Sorting Numbers ////////////////////////////////
        List<Integer> numbers = new ArrayList<Integer>();

        numbers.add(3);
        numbers.add(36);
        numbers.add(73);
        numbers.add(40);
        numbers.add(1);

        Collections.sort(numbers); // sorts in natural order

//        Collections.sort(numbers, new Comparator<Integer>() { // sorting in reverse numerical order
//            public int compare(Integer num1, Integer num2) {
//                return -num1.compareTo(num2); //here if - is removed then it sorts in numerical order
//            }
//        });

        for (Integer number : numbers) {
            System.out.println(number);
        }

        ////////////////////// Sorting arbitrary objects ////////////////////////////////

        List<Animal> animalList = new ArrayList<Animal>();

        animalList.add(new Animal(1, "Dog"));
        animalList.add(new Animal(3, "Lion"));
        animalList.add(new Animal(4, "Snake"));
        animalList.add(new Animal(2, "Bear"));

        // Sort in order of ID / numbers
        Collections.sort(animalList, new Comparator<Animal>() {//new Comparator<Animal>() is an anonymous class
            public int compare(Animal p1, Animal p2) {
                if (p1.getId() > p2.getId()) {
                    return 1;
                } else if (p1.getId() < p2.getId()) {
                    return -1;
                }
                return 0;
            }
        });

        for (Animal animal : animalList) {
            System.out.println(animal);
        }
        System.out.println("n");

        // Sort in order of name / string
        Collections.sort(animalList, new Comparator<Animal>() {
            public int compare(Animal p1, Animal p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });

        for (Animal animal : animalList) {
            System.out.println(animal);
        }

    }

}

