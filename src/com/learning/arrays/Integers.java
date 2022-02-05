package com.learning.arrays;

public class Integers {
    public static void main(String[] args) {
        int[] age = {4, 5, 6, 7, 5, 8, 9, 11, 14, 3};

       // System.out.println(age.length - 1);
        int lastAge = (age.length - 1);
       // System.out.println(age[lastAge]);


       // System.out.println(age[0]); //  print first age

        int middleAge = (age.length / 2);
      //  System.out.println(age[middleAge]);


        // multi-dimensional array
        int[][] multiArray = {{1, 2}, {3, 4, 7}, {4, 1, 6, 8}};  // index0 = {1,2},in index0 1 is index0 and 2 is index 1
       // System.out.println(multiArray[1][1]); // need to mention both outer index and within that index number.

        //using for loop in multidimensional arrays
        for (int rowIndex = 0; rowIndex < multiArray.length; rowIndex++){
            for (int colIndex = 0; colIndex < multiArray[rowIndex].length; colIndex++){
                System.out.print(multiArray[rowIndex][colIndex] + "  ");

            }

            System.out.println();

        }
    }
}
