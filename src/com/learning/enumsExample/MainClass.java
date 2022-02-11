package com.learning.enumsExample;

public class MainClass {
    /*
Enum declaration can be done outside a Class or inside a Class but not inside a Method.
You can also have an enum inside a class:
    enum Level {
        LOW,MEDIUM,HIGH }
*/
    public static void main(String[] args) {

        Level level1 = Level.HIGH;
        System.out.println(level1);
        System.out.println(" ");

//Loop Through an Enum
//The enum type has a values() method, which returns an array of all enum constants. This method is useful when you
// want to loop through the constants of an enum:
        for (Level myVar : Level.values()) {
            System.out.println(myVar);
        }

    }
}
