package com.learning.loopsCoding;

public class DoWhileLoopExample { //condition checked at loop end
    /* do{
    statements};
    while (condition)
     */

    public static void main(String[] args) {
        int iVal = 5;
        do {
            System.out.print(iVal);
            System.out.print(" * 2 = ");
            iVal *= 2;
           System.out.println(iVal);
        } while(iVal < 25);

        //example 2

        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while(i<=10);
    }
/*
 If the number of iteration is not fixed ,and you must have to execute the loop at least once,
 it is recommended to use a do-while loop.
 we need to enter Ctrl + C command to terminate the infinite loop.

*/


}
