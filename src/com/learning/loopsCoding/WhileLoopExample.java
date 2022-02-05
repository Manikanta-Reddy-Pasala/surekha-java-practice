package com.learning.loopsCoding;

public class WhileLoopExample {
    public static void main(String[] args) {
        int someNumber = 4;  //initialize
        int factorial = 1;
        while (someNumber > 1) {    //condition
            factorial *= someNumber; //multiply and assign
            someNumber--;     // increasing/decreasing
        } // flower braces in loops for block statements
       System.out.println(factorial);

        //Iterating an array using while loop
        int array[] = {2,7,9,12};
        int i = 0;
        while (i < array.length) {
            System.out.println(array[i]);
            i++;
        }

    }

}
 /*condition checked at loop start
 Loops can execute a block of code as long as a specified condition is reached
-Do not forget to increase the variable used in the condition, otherwise the loop will never end!
-The Java while loop is used to iterate a part of the program repeatedly until the specified Boolean condition is true.
- As soon as the Boolean condition becomes false, the loop automatically stops.
-The while loop is considered as a repeating if statement. If the number of iteration is not fixed, it is recommended to
 use the while loop.
  initialize;
  while (condition) {
  print statement;
  increasing/decreasing;}

 */
