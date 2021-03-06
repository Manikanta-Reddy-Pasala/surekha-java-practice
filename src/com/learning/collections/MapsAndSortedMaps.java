package com.learning.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapsAndSortedMaps {
    public static void main(String[] args) {
        /*
        Map and HashMap
The Map interface defines an object that maps keys to values. A map cannot contain duplicate keys; each key can map to
at most one value.

HashMap class provides the basic implementation of the Map interface of Java. It stores the data in (Key, Value) pairs.
To access a value in a HashMap, we must know its key. HashMap uses a technique called Hashing. Hashing is a technique of
 converting a large String to a small String that represents the same String so that the indexing and search operations
 are faster. HashSet also uses HashMap internally.

         */
//initializing maps: The following creates a map via the new operator and add multiple entries to it via the put operator.
        Map<Integer, String> hashMap = new HashMap<>();
        //or
        HashMap<Integer, String> maps = new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        hashMapMethod(hashMap);
        linkedHashMapMethod(linkedHashMap);

    }

    public static void hashMapMethod(Map<Integer, String> map) {

        map.put(5, "Five");
        map.put(7, "Seven");
        map.put(6, "Six");
        map.put(9, "Nine");
        map.put(0, "zero");
        //if we give same key to another value the second value gets replaced in the same key e.g: uncomment below
        // map.put(5, "Hello");

        //getting the string value by passing the key value
        String text = map.get(5);
        System.out.println(text);
        System.out.println("   ");

        //You can remove an entry from a map via the remove method.
        map.remove(5);

        //reiterating all the keys and values using loop
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ": " + value); //order wise is not printed. hashmaps & TreeMaps do not maintain order
            //hashmaps & TreeMaps maintain natural order i.e.,0,1,2,3, or a,b,c,d, etc
        }
        System.out.println("  ");

    }

    //if we need to store the key & value in order then we can use LinkedHashMap
    public static void linkedHashMapMethod(Map<Integer, String> map) {
        map.put(5, "Five");
        map.put(7, "Seven");
        map.put(6, "Six");
        map.put(9, "Nine");
        map.put(0, "zero");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ": " + value);
        }
    }
}

