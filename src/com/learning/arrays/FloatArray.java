package com.learning.arrays;

public class FloatArray {
    public static void main(String[] args) {
        float[] decimals = {2.1f,3.1f,4.12f,5.67f,1.99f};

         System.out.println(decimals[decimals.length-1]);

         System.out.println(decimals[0]);

         System.out.println(decimals[decimals.length/2]);

            // using for loop in arrays
        float sum = 0.0f;
        for (int i = 0; i < decimals.length; i++) {
              sum += decimals[i];
            System.out.println(sum);
        }

         int myValue = 50;
        int myNewValue = myValue-5;
        // System.out.println(myNewValue);

        int myScore = 55;
        myScore += 5;
         //  System.out.println(myScore);

        int marks = 55;
        marks -= 5;
        // System.out.println(marks);



    }
}
