package com.learning.conditionalAssignment;

public class LogicalAndOrStatements {
    public static void main(String[] args) {
        int a = 20;
        int b = 25;
        int c = 10;
       // int result = 0;

        if (a > b & b > c) {
            System.out.println("a>c");
        } else {
            System.out.println("a is not greater than c");
        }
    }
}
/*
Logical operators: what resolves to true
   And == & ..... true & true,
   or == | ..... true|false, false|true, true|true
   Exclusive or (XOR) == ^, only when one side is true .... true^false, false^true
   Negation == ! , means not..... false , (! false means true)
 Conditional logical operators: what resolves to true...
   And == && ....true && true, executes right side only if right side is true
   or == || ...false || true, true || ...(not executed right side), executes right side only if left side is false
example code in video: https://app.pluralsight.com/course-player?clipId=5a486c2a-e5a6-4c2a-8885-40d8e0e9babd
 */