package com.learning.conditionalAssignment;

public class SwitchStatementsExample {
    public static void main(String[] args) {
        double value1 = 100.0d;
        double value2 = 50.0d;
        double result = 0.0d;
        char opCode = 'a';

        switch (opCode) {
            case 'a':
                result = value1 + value2;
                break;
            case 's':
                result = value1 - value2;
                break;
            case 'd':
                result = value2 != 0 ? value1 / value2 : 0.0d;
                // Using conditional statement from ConditionsTopic. if value2 is not equal to 0,
                // result = value1/value2
                break;
            case 'm':
                result = value1 * value2;
                break;
            default:
                System.out.println("Invalid code: " + opCode);
                result = 0.0d;
                break;
        }
        System.out.println(result);
    }
}
/* The break Keyword

When Java reaches a break keyword, it breaks out of the switch block.
This will stop the execution of more code and case testing inside the block.
When a match is found, and the job is done, it's time for a break. There is no need for more testing.
A break can save a lot of execution time because it "ignores" the execution of all the rest of the code
 in the switch block.
 The default keyword specifies some code to run if there is no case match
 */