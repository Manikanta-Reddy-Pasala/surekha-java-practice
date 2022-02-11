package com.learning.loopsCoding;

public class NestedLoopExample {
    public static void main(String[] args) {

        int mat[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        //  System.out.println(mat [0] [1]);

        //Using for loop
        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat[i].length; j++) {
                System.out.print(mat[i][j] +"\t");
            }
        }
        System.out.println(" ");

        //using for each
        for (int[] ints : mat) {
            for (int j : ints) {
            //    System.out.print(j + " ");
            }
          //  System.out.println();
        }
      //  System.out.println();


        int lines = 4;

            for (int x =1; x<=lines; x++) {
                for (int y =1; y <= x; y++){
                    System.out.print(y + " ");
                }
                System.out.println();
            }
    }
}





