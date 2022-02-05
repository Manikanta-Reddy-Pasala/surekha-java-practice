package com.learning.loopsCoding;

public class ForLoopExample {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++) {
            System.out.println(i);
        }
/* condition checked at loop start
        if(initialize; condition ; increasing/decreasing){
        print statement;
        }
        If the number of iteration is fixed,it is recommended to use for loop.
     */

        // using for loop in arrays
        float[] decimals = {2.1f,3.1f,4.12f,5.67f,1.99f};
        float sum = 0.0f;
        for (int i = 0; i < decimals.length; i++) {
            sum += decimals[i];
            System.out.println(sum);
        }
    }
}
