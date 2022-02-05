package com.learning.conditionalAssignment;

// these are relational operators
public class IfElseStatements {
    public static void main(String[] args) {
        int val1 = 10;
        int val2 = 15;

/* why should we add curly braces in the if else statements??
    in if else conditions after if statement usually only one line below the "if" is executed. If we need add more than
    1 line then we have to add curly braces which creates a Block statement., then entire code in the block statement
    is executed.

*/

        if (val1 > val2) {
            System.out.println("val1 is bigger");
        }else {
            System.out.println("val1 is not bigger");
        }


//doing calculations using chained if/else statements

        double value1 = 100.0d;
        double value2 = 50.0d;
        double result = 0.0d;
        char opCode = 'd';

        if (opCode == 'a') {
            result = value1 + value2;
        } else if (opCode == 's') {
            result = value1 - value2;
        } else if (opCode == 'm') {
            result = value1 * value2;
        } else if (opCode == 'd') {
            result = value1 / value2;
        }

        System.out.println(result);


    }
}