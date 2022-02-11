package com.learning.testKnowledge;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        String [][] names = {{"Aadhya","daughter","good"},{"Mani","father","bad"},{"suri","mother","verygood"}};

        //System.out.println(names[1][2]);


        for(int row =0;row<names.length;row++){
            for(int col =0;col<names[row].length;col++){
                System.out.print(names[row][col] +"\t");
            }
        }
    }
}
