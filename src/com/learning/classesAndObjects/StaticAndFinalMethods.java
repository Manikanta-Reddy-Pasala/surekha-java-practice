package com.learning.classesAndObjects;

class Thing{

    public static final String LAST_LINE = "THE END"; /* assigning final creates a constant and should be in capital
    letters, and it is also attached with the class name */

    // Static method is used to count number of instances created e.g:
    public static int count = 0;
    public int id = 0; // we can also create unique id to each instance
    public Thing(){ //this is an empty constructor that runs every time
        id = count;
        count++;
    }


    public String name; /* with this numerous instances can be created in the main class like thing1.name, thing2.name...
     and can be called as Thing thing = new Thing(), many new instances can be created */

    public static String description; /*static is always associated with class and is called using class name e.g:
    Thing.description = "hello", only 1 instance */

    public static void showInfo(){ // writing static method..should mention return type hence void
        System.out.println("showing info");
        /*static methods can access only static data   e.g: below ..static methods cannot access nonstatic instances
        whereas nonstatic methods can access static data e.g: below showName method */
        System.out.println(description);
    }

    public void showName(){
        System.out.println( "instance id : " + id +" " + description +" , "+ name);
    }

}
public class StaticAndFinalMethods {

    public static void main(String[] args) {

        System.out.println("count before creating instances "+ Thing.count);

        Thing thing = new Thing(); // non-static instances
        Thing thing1 = new Thing();
        thing1.name = "I am a thing";

        System.out.println("count after creating instances "+ Thing.count);//using Static method to count number of instances

        Thing.description = "Hello";// static variable, associated with class name, called only once
        System.out.println(Thing.description);

        Thing.showInfo();// static method is also associated with class name and should be called using class name

        thing.showName();
        thing1.showName();

        System.out.println(Thing.LAST_LINE);
    }
}
