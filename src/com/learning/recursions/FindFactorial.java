package com.learning.recursions;

public class FindFactorial {
    public static void main(String[] args) {
        //factorial of 5 is 5*4*3*2*1
        factor (5);
        System.out.println(factor(5));
    }

    public static int factor(int number){
        if(number == 1){
            return 1;
        }
        else{
            return factor(number-1) *number;
        }
    }
}
